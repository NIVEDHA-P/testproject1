package project1;
import java.io.File;
import java.io.IOException;
import java.util.List;


public interface Files {
	
	public File createFile() throws IOException;
	public void removeFile(String fname);
	public File getFilesByName(String fname);
	public List<File> getAllFiles();
	
	
	


	}


