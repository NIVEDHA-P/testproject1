
package project1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class FilesImpl implements Files {
		
		


		public File createFile() throws IOException 
		{
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			String name;
			System.out.println("enter file name");
			name = s.nextLine();
			String fname = "C:\\nivedha" + "\\" + name;
			File f = new File(fname);
			
                if(!f.exists())
				
				{
					try {
						f.createNewFile();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					System.out.println("Enter the contents in the file");
					FileWriter fw = new FileWriter(name);
					fw.write(s.nextLine());
					fw.close();
					return f;

				}
				else
				{
					System.out.println("File name already exists please enter other name");
				}


		
			return null;
		}

		@Override
		public File getFilesByName(String fname) 

		{

			File file = new File("C:\\nivedha"+ "\\" + fname);

			try {
				if(fname.equals(file.getCanonicalFile().getName()) && file.exists())
				{

					System.out.println("the file name " + fname +" exists" );
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			

			return null;
		}

		@Override
		public void removeFile(String fname) 
		{

			File file = new File("C:\\nivedha"+ "\\" + fname);

			try {
				if(fname.equals(file.getCanonicalFile().getName()))
				{
					if(file.delete())
					{
						System.out.println("file deletion success");
						System.out.println("Deleted the file: " + fname);
					}
					else
					{
						System.out.println("No such file exist");
					}
				}
				else
				{
					System.out.println("File Not Found");
				}
			} catch (IOException e) {
			
				e.printStackTrace();
			}

		}

		@Override
		public List<File> getAllFiles()
		{
			File filesInDirectory = new File("C:\\nivedha");
			List<File> allFiles = Arrays.asList(filesInDirectory.listFiles());
			if(allFiles != null)
			{
				Collections.sort(allFiles);
				
				System.out.println(allFiles);
			}
			return null;
		}


		


	}

