# tp1Archi
5- afin de répondre à ce besoin on crée l’interface IObjetDessinable , puis dans la classe visage on vas implémenté cette interface avec le mot clé implements IObjetDessinable 
7- après le réfactoring on auras un problème dans la méthode animer () c’est que la méthode deplacer () n’est pas définit donc le visage s’affiche lors de l’exécution de l’animation mais il est fixe ne se déplace pas 
8- on définit dans l’interface IObjetDessinable une méthode abstraite deplacer () 
11- le rôle de chaque classe : 
Forme : une classe abstraite, c’est une classe mère qui contient des méthodes dont plusieurs classes héritent
FormeCirculaire : une sous classe de la classe Forme donc y’a une relation d’héritage entre eux, qui contient un constructeur 
FormeCirculaireReguliere : une sous classe de la classe Forme circulaire qui contient deux sous classe aussi
Etoile : sous classe de FormeCirculaireReguliere qui contient un constructeur et qui permet d’afficher une forme graphique Etoile dans la fenêtre de l’application mais qui ne se déplace pas 
PolygoneRegulier :  deuxième sous classe de FormeCirculaireReguliere qui contient un constructeur et qui permet d’afficher une forme graphique de polygone dans la fenêtre de l’application
14- le problème est : la méthode deplacer() elle est abstracte et elle est déjà donc une classe abstracte donc il faut la définir dans les classes Etoile et Polygone mais vide sans le corps  
