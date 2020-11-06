
public class EncryptDecrypt {
	
	public static void main(String[] args) throws Exception {
		PGPFileProcessor fileP = new PGPFileProcessor();
		
		fileP.setInputFile("C:\\Users\\vyshn\\Desktop\\encrypted.txt");
		fileP.setOutputFile("C:\\Users\\vyshn\\Desktop\\descrypted.txt");
		fileP.setKeyFile("C:\\\\Users\\\\vyshn\\\\Desktop\\secret.asc");
		fileP.setPassphrase("cckr");
		fileP.decrypt();
	}

}
