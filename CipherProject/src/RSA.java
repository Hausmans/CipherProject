import java.math.BigInteger;

public interface RSA {

	public BigInteger encrypt(String input, BigInteger n);

	public String decrypt(BigInteger input, BigInteger n);
}
