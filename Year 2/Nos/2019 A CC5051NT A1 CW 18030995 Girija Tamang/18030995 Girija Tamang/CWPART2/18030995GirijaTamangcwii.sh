#!/bin/bash



#function Declare

Theme () {

 #This function contain welcome part.



	echo ""



	echo "⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖"



	echo "»»    WElCOME TO GAME OF CRICKET        ««"  



	echo "⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖⁖"



	echo ""



	echo "»» Name: Mr\Mrs " $1            



	echo "»» Id:" $2



	echo "»» Date: " $( date )   #Print the current time.



	echo " "



}



CountryList () {



 #This function displays the country name with their respective code.



	echo "··································"



	echo "           ROUND 1		"



	echo "··································"



	echo "----------------------------------"



	echo "        Cricket Team              "



	echo "----------------------------------"



	echo "S.N.       Countries         Code"



	echo "»»»        »»»»»»»»»»        »»»»"



	echo " 1         Australia          AUS"



	echo " 2         Bangladesh         BAN"



	echo " 3         Nepal              NEP"



	echo " 4         India              IND"



	echo " 5         England            ENG"



	echo ""



	echo "**********************************"



	SelectTeam #Here SelectTeam has been called.



}

SelectTeam () {

#This function is used for select team .



	echo ""



	echo "‣‣‣‣ Please guess the best Cricket Team from the above list"



	echo "  entering the country code?"



	teamcode=""



	until [[ $teamcode == IND ]] #Here, until loop used for condition check.



		do



		echo -e "»»»» Enter the Country code (Eg: NEP): \c"







		read teamcode #reads input.







		case $teamcode in   #Here, case statement is used to match the statement.



		AUS) echo "Sorry! Your guess is wrong. Please choose another Cricket Team."



        ;;



		BAN) echo "Sorry! Your guess is wrong. Please choose another Cricket Team."  



        ;;



		NEP) echo "Sorry! Your guess is wrong. Please choose another Cricket Team."  



        ;;



		IND) echo ""



			 echo "Congratulation! Your guess is absolutely Correct."



			 echo "India is the best team who has won the Cricket World Cup Twice."



		PlayerInfo



   		;;



		ENG) echo "Sorry! Your guess is wrong. Please choose another Cricket Team."  



        ;;



		*) echo " Opps ! You have enter the wrong code or invalid input ! Please enter the available



code from the above list and choose the Best Cricket Team."



		esac

		done

		echo ""

}







PlayerInfo () {   #This function displays the player name with their respective code.



	echo "··································"



	echo "           ROUND 2		"



	echo "··································"



	echo "=================================="



	echo "  Players of the Cricket Team     "



	echo "=================================="



	echo " S.N.     Player        Code"



	echo " ⁓⁓⁓    ⁓⁓⁓⁓⁓⁓⁓⁓        ⁓⁓⁓⁓"



	echo " 1     Paras Khadka      PK"



	echo " 2     Virat Kholi       VK"



	echo " 3     David Warner      DW"



	echo " 4     Ben Stokes        BS"



	echo " 5     Ross Taylor       RT"



	echo ""



	echo -e "»» Select three Players with their respective code: \c"



	read player   #Takes the input



	for pl in $player

	do

		if [[ $pl == "PK" || $pl == "VK" || $pl == "DW" || $pl == "BS" || $pl == "RT" ]]

		then

			continue

		else

			echo " Opps ! You have enter the wrong code or invalid input ! Please enter the available



  code from the above list"



			echo ""

			PlayerInfo #calls the function itself, when the wrong input is provided

		fi

	done



	PlayerSelected $player  #choose parameter has been passed to PlayerChoosen function

	}



	PlayerSelected() {

		if [[ $# == 3 && $1 != $2 && $1 != $3 && $3 != $2 ]] # Here if is used to check whether the parameter is equal to 3 or not.

		then

			PS3="Select the best player with its respective number (like 1) : "

			select playerid in $player

			do

				case $playerid in



					"PK")



						FileRead Paras #Here Paras file has been read.



						break



						;;



					"VK") 



						FileRead Virat #Here Virat file has been read.



						break



						;;



					"DW") 



						FileRead David #Here David file has been read.



						break



						;;



					"BS")



						FileRead Ben  #Here Ben file has been read.



						break



						;;



					"RT")



						FileRead Ross #Here Ross file has been read.



						break



						;;



				esac



			done



			Restart  #restart has been called



		else



			echo " Error! Please enter the valid code or not same player from the list and please 



choose three players code only with space.For eg. PK VK DW"



			echo ""



			PlayerInfo  #PlayerInfo has been called



		fi



	}







	FileRead() {  #this function checks wheter the file exits or not.



		if [[ -f $1 ]] 



		then



			cat $1



		else



			echo ""



			echo "Sorry !! File not found !!!"



			echo ""



			CountryList



		fi



	}

	Restart() {  #this function asks user whether he/she wants to continue or not



		echo ""



		echo -e "Do you continue the program. If continue enter the 'yes':\c"



		read answer



		if [ $answer == yes ]



		then



			echo ""



			echo " ⁂ Welcome back. Good Luck !!⁂"   



			CountryList



		else



			echo "===[»»»» Thanks for playing !! »»»»»»"



			echo "===[»»»» Have a good day.  »»»»»» "



			exit



		fi



}



	Secretkey="torilal"



	



	if [[ $1 != ""  && $2 != "" ]]



	then



		while [[ $try -lt 5 ]]         #Here while loop is used to control flow input statement		



			do



			echo -e "Enter the secretkey: \c"



			read password



			if [[ $password == $Secretkey ]]     #Here if is used to compare the secretkey provided by user with the assigned value



			then 



			Theme $1 $2



			CountryList



			break



			else



			echo "Please try again. You have entered wrong secretkey. "



			let try++



			fi



			done



			echo ""



			echo "Please restart game again.Too many wrong attempts"



	else



			echo " "



			echo "----{•••••••> ERROR <•••••••}-----"



			echo "»» Please run program with your Name and ID !!! "



			echo " (Eg: bash 18030995cwii Girija 18030995)"



			echo " "



	fi

	exit



}







	



	