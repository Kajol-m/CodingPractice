/*
Enter your query here.
*/
SELECT C.hacker_id, H.name, COUNT(challenge_id) AS CNT
FROM Hackers H
        JOIN
     Challenges C
     ON H.hacker_id = C.hacker_id
GROUP BY C.hacker_id, H.name
HAVING CNT = (SELECT COUNT(C1.challenge_id) 
              FROM Challenges C1
              GROUP BY C1.hacker_id
              ORDER BY COUNT(*) DESC
              LIMIT 1)
                  OR
       CNT NOT IN (SELECT COUNT(C2.challenge_id)
                   FROM Challenges C2
                   GROUP BY C2.hacker_id
                   HAVING C2.hacker_id <> C.hacker_id)
ORDER BY CNT DESC, C.hacker_id ;
