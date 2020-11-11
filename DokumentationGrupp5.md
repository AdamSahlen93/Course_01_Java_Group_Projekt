
##Projekt Del 3

###Textual Analysis

####Kandidater
#####Objekt: 
TrainConductor, Ticket,  Passenger, Travelers, Menu, Main, TicketOptions, PassengerCategories, TicketCreator, 
TrainApplicationMain, AgeGroup, Prices, OnBoard, Train, TrainApplication 

#####Metoder: 
menu, main-method, showList, creatPassenger, creatTicketType, askPassenger, 
addTicketOptions, showTicketOptions, getters, setters.

#####Variaber: 
+forWhileLoop:int, +forSwitchLoop:int, +i:int, +customerChoice:int, -singleTicketRegular:int, -singleTicketDiscount:int, 
-monthlyTicketRegular:int, -monthlyTicketDiscount:int, -age:int, -firstName:String, -lastName:String, -fullName:String, 
+REGULAR:Enum, +SENIOR:Enum, +YOUTH:Enum, +choice:int, +savedInput:int, +savedTicketType:String

#####Aktörer:
Konduktören, Passageraren

####Vilka av kandidaterna som blev vad:

#####Objekt: 
Ticket, PassengerCategories 

#####Metoder: 

main-method, showList, creatPassenger, createTicket, addTicketOptions, 
showTicketOptions, getters , setters. 

#####Variaber: 

+whileLoop:int, +switchLoop:int, +i:int, +customerChoice:int, -singleTicketRegular:int, -singleTicketDiscount:int,
 -monthlyTicketRegular:int, -monthlyTicketDiscount:int, -age:int, -firstName:String, -lastName:String, +REGULAR:Enum, 
 +SENIOR:Enum, +YOUTH:Enum, +choice:int +savedInput:int, +savedTicketType:String

#####Aktörer:
Konduktören

#####Motivering av objekt (endast objekten ska motiveras): 
Ticket / PassengerProperties: Vi valde dessa objekt för att vi anser att det är tydligt vad de representerar. Där klassen 
Ticket hanterar allt som handlar om biljetter i programmet, och PassengerProperties hanterar allt som definierar en 
passagerare. 
 
####Daglogg

#####29/10: 
- Val av kommunikationsplattformen Teams, då handledaren/projektägaren kan hoppa in och ut när det passar henne. 
- Vi diskuterade projektet lite kort, hur vi känner inför det och hur vi helst vill arbeta.
- Vi tänker att vi drar igång redan imorgon, ser över själva hur vi hade gått tillväga för att lösa problemet.
- Vi jobbar gärna tillsammans (diskuterar medans vi gör) t ex delar skärm och “pratar om koden” så att begrepp och 
liknande blir mer naturligt att använda. 
-Kommentar till Robin(som inte medverkade denna dag): Vi tänkte dra igång efter 9 imorgon, vi vill att alla ska få ut 
något av projekten och lära sig oavsett  vilken nivå vi känner att vi är på, så om det är något som inte fungerar för en 
själv så är det bara att säga till. 

##### 30/10: 
- Diskuterar lösningsförslag - Skapade en mindmap över projektet.
- Pseudokod över programmet skrivs - delar skärm och kodar tillsammans.
- Efter mindmap börjar vi diskutera och skapa en första UML (Som kommer arbetas med under hela projektet).
- Egen fördjupning i de metoder vi kan tänkas använda. 

##### 2/11:
- Diskutering Github och olika tillvägagångssätt för att få smidighet mellan projectdeltagarna. 
- Implementering av github repository där vi fördjupade oss i hur man använder GitHub. Efter dagens slut kunde samtliga 
hämta och pusha ändringar till vårt gemensamma repository.

##### 4/11: 
- Fördjupning i Getters och setters samt priviata attribut. 
- Diskussion om encapsulation, polymorfism och datahiding förs och hur vi skulle kunna applicera dessa i projektet.  


##### 5/11: 
- Arbete med att strukturera upp projektet ytterligare i UML-diagram/ Pseudokod för att förtydliga för varandra igen.
- Analys om hurvida vi kan använda oss av ENUM / Interface och fördelar/nackdelar. 

##### 6/11:
- Projektägaren Sandra kom in i vår teamgrupp under dagen och vi diskuterade vårt program med eventuella förändringar av 
klassnamn. 
- Detta arbetade vi resterande tid av dagen. 

##### 9/11:
- Fortsatt arbete med justeringar efter Sandras besök 6/11 samt ytterligare fördjupning av UML.

##### 10/11:
- Produktmöte med projektägaren Sandra där vi kom fram till att vi borde flytta main-metoden till en redan befintlig 
klass. 
- Dessa ändringar analyserades och utfördes.

##### 11/11:
- Vi sammanställde projektets olika delar inför presentationen, där vi gick igenom så att mappstruktur, UML och rapport 
var korrekt strukturerat.


#####På vilket sätt har ni använt er av Objektorentering? Vi har använt oss av objektorientering genom att... :
Vi har arbetat objektorienterat genom att använt oss av olika klasser, interface, enum, abstrakta klasser, inkapsling, 
arv och datahiding. Våra metoder är uppdelade så att varje metod utför det som den är benämnd till. Vi har försökt 
att arbeta efter DRY-principen för att kunna reducera kod och få en lättare överblick. Vi strävade även efter att ha vår 
mainmetod så "clean" som möjligt.
Vi ville testa att väva in både ett enum och ett interface i vårt program för att bygga ytterligare förståelse för detta. 


#####Vilka klasser och metoder har vem haft ansvar för?
Tilldelningen:
 
Adam: Klass: Ticket, TicketOptions. Enum: PassengerCategories, samtliga metoder inom klasserna.
  
Simon: Klass: TrainApplicationMain. Interface: IPassenger, samtliga metoder inom klasserna.
  
Robin: Klass: PassengerProperties, Rapport: README, samtliga metoder inom klasserna.

Vi har, som beskrivits tidigare, haft ett gemensamt övergripande ansvar för samtliga delar av projektet. 
Projektet har till stor del byggts genom skärmdelning där någon skrivit och alla har kunnat ge feedback.
Därför anser vi att samtliga av oss i gruppen har hjälpt till i varje klass och metod även ifall vi har haft en tilldelning.

##### Hur har det gått att jobba i grupp? Var det nåt som blev enklare att vara i grupp än att vara själv? Vad har ni 
#####stött på för svårigheter med att jobba i grupp?
Generellt så har vårt grupparbete fungerat väldigt bra redan från start då alla i gruppen varit likasinnade. 
Det vi kommit fram till som har varit enklare med att arbeta i grupp är möjligheten till att bygga ytterligare förståelse 
genom kontinuerlig dialog mellan deltagarna, felsökningar gick enklare/snabbare då sex ögon är bättre än två, samt att 
vi kunde komplettera varandras kunskaper hela tiden och lära oss av varandra. 

De svårigheter vi kan peka på i efterhand är att det inte är oproblematiskt att hitta en fungerande struktur för att 
kunna koppla ihop tre individers tankar och ideer till ett gemensamt projekt, samt att finna tider som passar alla 
deltagarna. 
   

 
 #### Beskrivning av hur vårt grupparbete har gått till :
Vi började med en övergripande diskussion om projektet och skapade en mindmap som ingångspunkt tillsammans med en förenklad UML.

Då projektet i sin helhet inte verkade för komplext, ville vi som grupp och individer nyttja tillfället att alla skulle 
få lära sig så mycket som möjligt, lät vi alla göra ett eget förslag till programmet i pseudokod.  
De individuella pseudokoderna diskuterade vi gemensamt och delade skärmar för att gå igenom alla förslag.  
Vi tog sedan ur delar som vi alla gillade och testade att sätta ihop projektet genom att skapa ett githubprojekt samt 
gemensamt repository.  
I githubprojektet bröt vi ner projektet som helhet i mindre uppgifter och tilldelade dessa till samtliga gruppmedlemmar.
Efter indelning skapade var och en de tillordnade objekten inkluderande pseudokod och lade till dessa i repository:n.
Därefter kodade vi alla klasser tilsammans via delad skärm.
Efter att ha kodat första versionen av programmet insåg vi att vissa av klassnamnen borde bytas för att göra 
programmet mer lättläst, självdokumenterande och logiskt.

 
