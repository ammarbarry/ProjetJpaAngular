# Projet Jpa / Angular & MongoDB
### Ammar BARRY & Erika Mbaffeu DIBATE

## Projet Jpa / Angular

## MongoDB
   Reponse de NoSQL

1) Quelles sont les limites d'une base données orientees document?
Les limites d'une base donnees orientees document sont environ de 4Mo par document et sont limitées au niveau des transactions. 
Pour la modification de plusieurs objets dependant les uns des autres, les bases de données orientées document n'offrent pas les garanties qu'on retrouve avec le relationnel.
Les bases de données NoSQL ne respectent pas les propriètés ACID et les contraintes d'integrite ne sont generalement pas implementées. 

2) a. Quelles sont les types de donnees stockes dans Redis?
Redis est une base de donnees “cles/valeurs”. Il permet de stocker des types simples : String, Set, List, Map et OrderedSet.
Il dispose de nombreuses commandes permettant de manipuler differents types de donnees : 
– Les chaines de caracteres; 
– Les listes triées;
– Les listes non triées;
– Les piles (lists);
– Les hashs (hashes, permettant de stocker des « sous-cles »).

  b. Que peut on faire comme types de requetes?
On peut faire deux types de requetes dans Redis :
- Celles qui recherchent des objets sans parent : ce type de requete est le plus rapide.
- Celles qui recherchent des objets qui ont un parent commun : ce type de requete est plus long.
