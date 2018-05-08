import java.math.BigInteger;
import java.util.Scanner;

public class fib2 {
	static Scanner sc = new Scanner(System.in);
	static BigInteger X[][] = new BigInteger[2][2];

	public static BigInteger calculatefib(long sum1, long sum2, int N) {

		BigInteger result = new BigInteger("0");

		BigInteger[] fib = new BigInteger[1 + Math.max(2, N)];
		fib[0] = BigInteger.valueOf(sum1);
		fib[1] = BigInteger.valueOf(sum2);
		for (int k = 2; k < N; k++) {
			fib[k] = fib[k - 1].add(fib[k - 2]);
		}
		result = result.add(fib[N - 1]);

		return result;
	}

	static void multiply(BigInteger F[][], BigInteger M[][]) {
		X[1][0] = (F[1][0].multiply(M[0][0])).add(F[1][1].multiply(M[1][0]));
		X[0][0] = (F[0][0].multiply(M[0][0])).add(F[0][1].multiply(M[1][0]));
		X[1][1] = (F[1][0].multiply(M[0][1])).add(F[1][1].multiply(M[1][1]));
		X[0][1] = (F[0][0].multiply(M[0][1])).add(F[0][1].multiply(M[1][1]));
		F[1][0] = X[1][0];
		F[0][0] = X[0][0];
		F[1][1] = X[1][1];
		F[0][1] = X[0][1];

	}

	static void power(BigInteger[][] f, long n) {
		if (n == 0 || n == 1)
			return;
		BigInteger x = BigInteger.valueOf(1);
		BigInteger y = BigInteger.valueOf(0);
		BigInteger M[][] = new BigInteger[][] { { x, x }, { x, y } };
		power(f, n / 2);
		multiply(f, f);

		if (n % 2 != 0)
			multiply(f, M);
	}

	public static void main(String[] args) {
		try {
			int T = sc.nextInt();
			int j = 0;
			while (j < T) {
				int M = sc.nextInt();
				int N = sc.nextInt();
				long arr[] = new long[M];
				long arr2[] = new long[M];
				long sum1 = 0;
				long sum2 = 0;
				for (int i = 0; i < M; i++) {
					arr[i] = sc.nextLong();
					sum1 += arr[i];

				}
				for (int i = 0; i < M; i++) {
					arr2[i] = sc.nextLong();
					sum2 += arr2[i];
				}
				sum1 = sum1 * M;
				sum2 = sum2 * M;
				// BigInteger output = fib(M);

				BigInteger x = BigInteger.valueOf(1);
				BigInteger y = BigInteger.valueOf(0);
				BigInteger z = BigInteger.valueOf(sum1);
				BigInteger p = BigInteger.valueOf(sum2);
				BigInteger q = z.add(p);
				BigInteger F[][] = new BigInteger[][] { { x, x }, { x, y } };
				BigInteger P[][] = new BigInteger[][] { { q, p }, { p, z } };
				if (N == 1) {
					// System.out.println("dcbh");
					System.out.println(sum1);
				} else if (N == 2) {
					// System.out.println("dcbssh");
					System.out.println(sum2);
				} else if (N == 3) {
					// System.out.println("dcbssbh");
					System.out.println(sum1 + sum2);
				} else if (N <= 100) {

					BigInteger n = calculatefib(sum1, sum2, N);
					// fib(sum1*M, sum2*M, N);
					BigInteger x1 = new BigInteger("1000000007");
					System.out.println(n.mod(x1));
					continue;
				} else {
					power(F, N - 2);
					// multiply(P,F);
					// System.out.println(F[0][0]);
					// BigInteger o= (F[0][0].multiply((q))).add(F[1][0].multiply(z));
					F[0][1] = F[0][0].multiply(p).add(F[0][1].multiply(z));
					BigInteger modm = BigInteger.valueOf(1000000007);
					System.out.println(F[0][1].mod(modm));
					continue;
				}
			}
			j++;
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
