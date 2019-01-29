{   NAME:  Mindy Altschul
    CLASS: Comp Sci 1
    DATE: October 9, 2017

    PURPOSE: make a guessing game.

    PLAYED BY; Elizabeth and Alexander

}

program pickanumber;

uses
   crt;

Procedure getInt(ask: string; var num : integer);
var
   numStr : string;
   code : integer;
begin
   repeat
      write(ask);
      readln(numstr);
      val(numStr, num, code);
      if code <> 0 then
      begin
         writeln('Not an integer ');
         writeln('Press any key to try again.');
         writeln;
         readkey;

      end;
   until (code = 0);
end;

Procedure getchar(ask: string; var again : char);

begin
   repeat
      write(ask);
      readln(again);
      again := upcase(again);
      if (again <> 'Y') and (again <> 'N')then
      begin
         writeln('Please enter either a Y or an N.');
         writeln('Press any key to try again.');
         writeln;
         readkey;
      end;
   until (again= 'Y') or (again= 'N');
end;

var
   comnum, guess: integer;
   lives, numofguess: integer;
   level: integer;
   again : char;

begin {main}
    {this is where the code goes}

    comnum := 0;
    lives :=5;
    numofguess:=0;
    level:=1;
    {fancy intro}
    textcolor(lightcyan);
    write('Guess ');
    textcolor(yellow);
    write('The ');
    textcolor(lightcyan);
    writeln('Number');
    delay(500);
    writeln;
    writeln;
    textcolor(white);
    writeln('The object of this game is to guess the number the computer is thinking of within a certain number of guesses.');
    delay(2000);
    writeln;
    writeln('If you don"t correctly guess the number the computer is thinking of within the number of guesses you will lose one life.');
    delay(2200);
    writeln('You will begin with 5 lives');
    delay(1500);
    writeln;
    writeln('Once you have sucessfully guessed the number 3 times you will advance to the next level.');
    delay(2000);
    writeln;
    writeln('Please hit enter once you have answered each prompt.');
    delay(1500);
    writeln;
    writeln('Please hit enter to continue the game.');
    readkey;
    clrscr;

Repeat {begin first level stage}                                   {begin first level stage}
    numofguess:=0;

    randomize;
    comnum := random(10)+1;

 Repeat
    textcolor(white);
   {delete comnum when done testing!!!!}
    gotoxy(50,1);
    write('Lives: ',lives);
    gotoxy(100,1);
    numofguess:=numofguess+1;
    writeln('Number of Guesses: ',numofguess);
    writeln;
    gotoxy(0,3);
    getint('Enter a number between 1 and 10: ', guess);

    {compare numbers}
  if (guess=comnum) then
    begin
      level:=level+1;
      textcolor(yellow);
      writeln('Congratulations! You guessed correctly!');
    end

  else
    writeln('Try again.');

  if (guess<comnum) then
    begin
      textcolor(lightgreen);
      writeln('Too low.');
    end;


  if (guess>comnum) then
     begin
      textcolor(lightcyan);
      writeln('Too high.');
    end;

     delay(1000);
     clrscr;

 until (numofguess=4) or (guess=comnum);

if(numofguess=4)and(guess<>comnum) then
   begin
     textcolor(white);
     writeln('Sorry. Better luck next time.');

     lives := lives-1;

     delay(500);
     writeln;
     getchar('Do you want to continue the game?(Y/N): ', again);
    end;

if (guess=comnum) then
   begin
     textcolor(white);
     delay(500);
     writeln;
     getchar('Do you want to continue the game?(Y/N): ', again);
   end;


if (again='Y') then
   begin{yes}
     writeln;
     writeln('Let"s go!');
     writeln;
     writeln('Please hit enter to continue the game.');
     readkey;
     clrscr;
   end; {yes}

until(again='N') or (lives=0)or (level=4); {end first level stage}   {end first level stage}

if (again='N') then
   begin{no}
     writeln;
     writeln('Good bye.');
     writeln;
     writeln('Please hit enter to end game.');
     readkey;
   end;{no}

if (lives=0) then
   begin{no}
     writeln('Sorry you ran out of lives. :/ ');
     writeln;
     writeln('Please hit enter to end game.');
     readkey;
   end;{no}

   {begin next level here!!!}                                       {begin next level here!!!}

if (level=4) then
begin
     textcolor(yellow);
     writeln('Congratulations! You have reached Level 2!!');
     writeln;
     delay(1500);
     writeln('You will now guess a number between 1-15.');
     delay(500);
     writeln('Please hit enter to continue the game.');
     readkey;
     clrscr;

  Repeat {begin second level stage}                                {begin second level stage}
    numofguess:=0;

    randomize;
    comnum := random(15)+1;

 Repeat
    textcolor(white);
   {delete comnum when done testing!!!!}
    gotoxy(50,1);
    writeln('Lives: ',lives);
    gotoxy(100,1);

    numofguess:=numofguess+1;
    writeln('Number of Guesses: ',numofguess);
    writeln;
    gotoxy(0,3);
    getint('Enter a number between 1 and 15: ', guess);

    {compare numbers}
   if (guess=comnum) then
    begin
      level:=level+1;
      textcolor(yellow);
      writeln('Congratulations! You guessed correctly!');
    end

  else
    writeln('Try again.');

  if (guess<comnum) then
    begin
      textcolor(lightgreen);
      writeln('Too low.');
    end;


  if (guess>comnum) then
     begin
      textcolor(lightcyan);
      writeln('Too high.');
    end;

     delay(1000);
     clrscr;

 until (numofguess=4) or (guess=comnum);

if(numofguess=4)and(guess<>comnum) then
   begin
     textcolor(white);
     writeln('Sorry. Better luck next time.');

     lives := lives-1;

     delay(500);
     writeln;
     getchar('Do you want to continue the game?(Y/N): ', again);
    end;

if (guess=comnum) then
   begin
     textcolor(white);
     delay(500);
     writeln;
     getchar('Do you want to continue the game?(Y/N): ', again);
   end;


if (again='Y') then
   begin{yes}
     writeln;
     writeln('Let"s go!');
     writeln;
     writeln('Please hit enter to continue the game.');
     readkey;
     clrscr;
   end; {yes}

until(again='N') or (lives=0)or (level=7);{end second level stage}  {end second level stage}

if (again='N') then
   begin{no}
     writeln;
     writeln('Good bye.');
     writeln;
     writeln('Please hit enter to end game.');
     readkey;
   end;{no}

if (lives=0) then
   begin{no}
     writeln('Sorry you ran out of lives. :/ ');
     writeln;
     writeln('Please hit enter to end game.');
     readkey;
   end;{no}

   {begin next level here!!!}                                       {begin next level here!!!}
end;

if (level=7) then
begin
     writeln('Congratulations! You have reached Level 3!!');
     writeln;
     delay(1500);
     writeln('You will now guess a number between 1-25.');
     delay(500);
     writeln('Please hit enter to continue the game.');
     readkey;
     clrscr;

 Repeat {begin last level stage}                                    {begin last level stage}
    numofguess:=0;

    randomize;
    comnum := random(25)+1;

 Repeat
    textcolor(white);
    {delete comnum when done testing!!!!}
    gotoxy(50,1);
    writeln('Lives: ',lives);
    gotoxy(100,1);

    numofguess:=numofguess+1;
    writeln('Number of Guesses: ',numofguess);
    writeln;
    gotoxy(0,3);
    getint('Enter a number between 1 and 25: ', guess);

    {compare numbers}
  if (guess=comnum) then
    begin
      level:=level+1;
      textcolor(yellow);
      writeln('Congratulations! You guessed correctly!');
    end

  else
    writeln('Try again.');

  if (guess<comnum) then
    begin
      textcolor(lightgreen);
      writeln('Too low.');
    end;


  if (guess>comnum) then
     begin
      textcolor(lightcyan);
      writeln('Too high.');
    end;

     delay(1000);
     clrscr;

 until (numofguess=4) or (guess=comnum);

if(numofguess=4)and(guess<>comnum) then
   begin
     textcolor(white);
     writeln('Sorry. Better luck next time.');

     lives := lives-1;

     delay(500);
     writeln;
     getchar('Do you want to continue the game?(Y/N): ', again);
    end;

if (guess=comnum) then
   begin
     textcolor(white);
     delay(500);
     writeln;
     getchar('Do you want to continue the game?(Y/N): ', again);
   end;


if (again='Y') then
   begin{yes}
     writeln;
     writeln('Let"s go!');
     writeln;
     writeln('Please hit enter to continue to the game.');
     readkey;
     clrscr;
   end; {yes}

until(again='N') or (lives=0)or (level=11);{last level stage}{last level stage}{last level stage}


if (again='N') then
   begin{no}
     writeln;
     writeln('Good bye.');
     writeln;
     writeln('Please hit enter to end game.');
     readkey;
   end;{no}

if (lives=0) then
   begin{no}
     writeln('Sorry you ran out of lives. :/ ');
     writeln;
     writeln('Please hit enter to end game.');
     readkey;
   end;{no}

if (level=11) then
   begin
      textcolor(yellow);
      writeln('Congratulations! You guessed correctly!');
      delay(500);
      writeln('Please hit enter to end the game.');
      readkey;
   end;
end;
end. {main}
