import java.math.BigInteger;

public class Receive implements RSA {

	private BigInteger privateKey;
	
	public Receive(BigInteger publicKey, BigInteger n){
		privateKey(publicKey, n);
	}
	
	public integerConversion(){
		
	}
	
	private BigInteger privateKey(BigInteger publicKey, BigInteger n){
		privateKey = publicKey.modInverse(n);
		return null;
	}
	
	public BigInteger encrypt(String input) {
		return null;
	}

	public String decrypt(BigInteger input, BigInteger n) {
		BigInteger temp = input.modPow(privateKey, n);
		return ;
	}

}
