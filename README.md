# progmod2

Az alábbi program a Programozás módszertana 2 tárgyra készült beadandónak.
A programban a felhasználó az általa elolvasott könyveket tudja eltárolni
a localhost:8080/post-on végzett POST requesttel. A könyv objektum formátuma:
{"title" : String,
"author" : String,
"pages" : String,
"language" : Enum }
amelynek az opciói: Hungarian, English, German

A felhasználó továbbá le is kérheti az eddig olvasott könyveit egy CSV 
fájlból a localhost:8080/get-en egy GET hívással.
