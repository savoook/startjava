SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status<>'Destroyed';
SELECT * FROM Jaegers WHERE mark in ('Mark-2', 'Mark-4');
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers ORDER BY launch limit 1;
SELECT * FROM Jaegers WHERE kaijuKill in ((SELECT MAX(kaijuKill) FROM Jaegers), (SELECT MIN(kaijuKill) FROM Jaegers));
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET kaijuKill =kaijuKill +1 WHERE status<>'Destroyed';
DELETE FROM Jaegers WHERE status='Destroyed';

