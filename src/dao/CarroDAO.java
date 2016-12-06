package dao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean
public class CarroDAO {
	
/*
 * 
 * 
select que retorna lista de carros	
	SELECT `carros`.`idcarro`,
    `carros`.`carromarca`,
    `carros`.`carronumero`
FROM `rally`.`carros`;

insert
 
 * INSERT INTO `rally`.`carros`
(`idcarro`,
`carromarca`,
`carronumero`)
VALUES
(<{idcarro: }>,
<{carromarca: }>,
<{carronumero: }>);

update

UPDATE `rally`.`carros`
SET
`idcarro` = <{idcarro: }>,
`carromarca` = <{carromarca: }>,
`carronumero` = <{carronumero: }> 
WHERE `idcarro` = <{expr}>;
 
delete
 
 DELETE FROM `rally`.`carros`
WHERE <{where_expression}>;


 */
	
}
