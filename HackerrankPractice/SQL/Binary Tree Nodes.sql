SELECT N, IF(P IS NULL,'Root',IF(N IN(SELECT DISTINCT P FROM BST),'Inner','Leaf'))
FROM BST
ORDER BY N;
/*
SELECT N,
    CASE
        WHEN P IS NULL THEN 'Root'
        WHEN N IN (SELECT DISTINCT P FROM BST) THEN 'Inner'
        ELSE 'Leaf'
    END
FROM BST
ORDER BY N;
*/

/*
SELECT N, IF(P IS NULL,'Root',IF((SELECT COUNT(*) FROM BST WHERE P=B.N)>0,'Inner','Leaf'))
FROM BST as B
ORDER BY N;
             
*/
             
