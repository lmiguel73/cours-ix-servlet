# cours-IX-servlet
## Contenu
* CookieServlet : /cookie
> Exemple d'utilisation d'un cookie
* HomeServlet   : /home
> Exemple d'utilisation du contexte du serveur
  * Premier chargement, le ``username`` est null
  * Second chargement, le ``username`` vaut "Toto"
* DispatcherServlet : /dispatcher
> Exemple d'utilisation de l'`include`
> Le dispatcher inclut le traitement du HomeServlet auquel il ajoute ```---- Fin```
* SessionServlet : /session
> Exemple d'utilisation d'une session
  * Si pas de session, formulaire de login et bouton de connexion
  * Si présence d'une session, affichage du nom de l'utilisateur authentifié et d'un bouton se déconnecter
* RedirectAndForwardServlet : /redirectAndForward
> Exemple pour différencier le `sendRedirect`du `forward`
  
