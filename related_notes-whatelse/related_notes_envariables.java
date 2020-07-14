*********begin*********
	###Notes on Environment variable:###
	
	Environment variables store information about the operating system environment. This info 
	includes details such as the operating system path, the number of processors uses by operating 
	system, and the location of temperary folder.
	
	The environment vairables store data that is used by the operating system and other programs. For 
	example, the 	**WINDIR** 	environment variable contains the location of the ***windows installation directory***.
	Program can Query the value of this varaible to determine where Windows operating system files are located.
	
	PowerShell can accesss and manage enviroment variables in any of the supported operating system platform.
	The powerShell enviroment provider simplifies this process by making it easy to view and change environment 
	variables.
	
	Environment variables, unlike other types of variables are inherited by ***child processes***, 
	>such as ***local background*** jobs and the ***session*** in which module member run.
	>This makes enviroment variable well suited 
	>to storing values that are needed in both ***parent and child process***.
	
	###Changing environment variables: ###
	
	> 	On Windows, environment variables can be defined in three scopes:
	>>	Machine(or System) scope.
	>>	User scope.
	>>	Process scope.
	
	
	+-----------------------------------------------------------------+
	|	Process scope = PowerShell Environment vairable					
	|	available in current session/process							
	|																	
	|	Inherited from parent process and constructed from 				
	|	Machine scope or user scope variables.									
	|																											
	|	Changing the environment varaible in PS affects only 			
	|	The current session. 	This behavior resembels "Set" cmd 		
	|	Windows command Shell and "Setenv" command in  			
	|	UNIX-based environments. To change values in the Machine
	|	or user Scopes, you must use the methods of  						
	| 	*****System.Enviroment**** class.											
	+-----------------------------------------------------------------+
	
	
	### SYNTAX TO REMEMBER ###
	
	IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
	You can change the values of variables without using a cmdlet
	using the following syntax:
	
	$Env:<variable-name> = "<new-value>"
	
	to append ;c:\temp to the value of the path environment variable
	
	$Env:path += ";c:\temp"
	$Env:path += ":/usr/local/temp"	//comment
	
	Set-Item -Path Env:Path  -value ($Env:Path + ";C:\Temp") //comment
	
	IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
	
	###	COMMENTS ON SYTAX ###
	
	On Linux or MacOS, the colon (:) in the command seperates the new 
	path from the path that precedes it in the list.
	
	You can also use Item cmdlets, such as Set-Item, Remove-Itemm and Copy-Item to change
	the values of enviroment variables. For Example, to use the Set-Item cmdlet to append ;c:\temp
	to the value of the Path enviroment variable, use the following syntax:
	
	
	
	
	
	

*********end*********