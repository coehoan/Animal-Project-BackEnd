SELECT * FROM Sido;
SELECT * FROM Sigungu;

DROP TABLE ShelterDto;
DROP TABLE SidoDto;
DROP TABLE SigunguDto;

SELECT sg.id, sg.uprCd, sg.orgCd, sg.orgdownNm FROM Sido sd
INNER JOIN Sigungu sg ON sd.orgCd = sg.orgdownNm;

SELECT * FROM Sido WHERE orgCd;