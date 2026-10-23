# TP 1 : Cartographier la livraison manuelle

## Actions manuelles pour mettre en ligne ERIS Inscriptions

| N° | Action | Qui la fait ? | Durée estimée | Risque d'erreur (1 à 5) | Automatisable ? |
|----|--------|---------------|---------------|-------------------------|-----------------|
| 1 | Récupérer la dernière version du code | Développeur | 2 min | 2 | Oui |
| 2 | Vérifier que le projet compile | Développeur | 3 min | 2 | Oui |
| 3 | Lancer les tests | Développeur | 5 min | 3 | Oui |
| 4 | Construire le jar (mvn clean package) | Développeur | 3 min | 2 | Oui |
| 5 | Se connecter au serveur | Développeur | 2 min | 3 | Partiellement |
| 6 | Copier le jar sur le serveur | Développeur | 5 min | 4 | Oui |
| 7 | Arrêter l'ancienne version | Développeur | 2 min | 4 | Oui |
| 8 | Lancer la nouvelle version | Développeur | 2 min | 4 | Oui |
| 9 | Vérifier que l'application répond | Développeur | 5 min | 3 | Oui |
| 10 | Prévenir l'équipe de la mise en ligne | Développeur | 3 min | 2 | Oui |
| 11 | Revenir à l'ancienne version en cas d'échec | Développeur | 15 min | 5 | Oui |

## Classement des actions

- CI (build et tests) : actions 1, 2, 3
- Delivery (production de l'artefact) : action 4
- Deployment (mise en ligne) : actions 5, 6, 7, 8, 9
- Hors phases (souvent oubliées) : action 10 (prévenir l'équipe) et action 11 (retour arrière)

## Pipeline cible

commit -> build -> tests -> package -> déploiement

- Déclencheur : un push ou une Pull Request
- En cas d'échec : le pipeline s'arrête et l'équipe est prévenue
- Statut : vert (succès) ou rouge (échec)
