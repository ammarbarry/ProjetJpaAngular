# Projet Jpa / Angular & MongoDB
### Ammar BARRY & Erika Mbaffeu DIBATE

## Projet Jpa / Angular

Les travaux réalisés sur JPA sont les suivants :
- Constat que ce projet est avec deux dépendances (hibernate et hsqldb (driver jdbc pour hsqldb)) à travers le pom.xml
- Transformation d'une première classe en entité et d'une première association entre deux entités
- Réalisation d'un modèle métier et intégration d'une classe de service permettant de peupler la base mais aussi de faire des requêtes sur la base de données
- Modification du fichier persistence.xml afin de nous connecter sur une base de données MySQL
- Portage de notre application et gérération de relations d’héritage, de requêtes et d'une requête nommée
- Compréhension du problème du n+1 select.

Pour atteindre le but du TP qui est de construire à partir de nos compétences en AngularJS une interface Web pour votre application développée en Java côté serveur.
Tout d'abord, nous avons installés  grunt, grunt-cli, yo, …. puis initialiés le projet tout en choisissant le générateur angular et repondant aux questions lors de la génération.
Après la génération, nous avons saisis les commandes suivantes : npm i, bower i, grunt, grunt serve. Un navigateur est ouvert avec le projet à l’intérieur. Grunt ouvre un serveur web sur le port 9000.
Nous avons aussi importés ce projet dans eclipse et avons créés une interface utilisateur qui utilise un service de lecture (GET) et un service d’écriture (POST) du projet JPA + JaxRS qui se réalisent sur la même page. 

## MongoDB
   Reponse de NoSQL :

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
