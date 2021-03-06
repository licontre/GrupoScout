CREATE TABLE ASISTENCIA (ID BIGINT NOT NULL, CONFIRMACION VARCHAR(255), FECHA DATE, OBSERVACION VARCHAR(255), ASISTENCIA_ID BIGINT, USUARIO_ID BIGINT, PRIMARY KEY (ID))
CREATE TABLE COMENTARIO (ID BIGINT NOT NULL, COMENTARIO VARCHAR(255), FECHA DATE, COMENTARIOS_ID BIGINT, USUARIO_ID BIGINT, PRIMARY KEY (ID))
CREATE TABLE CUOTA (ID BIGINT NOT NULL, DESCRIPCION VARCHAR(255), IMPORTE FLOAT, NOMBRE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE DOCUMENTO (ID BIGINT NOT NULL, COPIADOCUMENTO VARCHAR(255), ESTADO VARCHAR(255), NOMBRE VARCHAR(255), TIPO VARCHAR(255), EVENTOS_ID BIGINT, PRIMARY KEY (ID))
CREATE TABLE EVENTO (ID BIGINT NOT NULL, FECHA DATE, LOCALIZACION VARCHAR(255), NOMBRE VARCHAR(255), PRECIO FLOAT, PRESUPUESTO FLOAT, PRIMARY KEY (ID))
CREATE TABLE PAGOCUOTA (ID BIGINT NOT NULL, FECHA DATE, PAGOSCUOTA_ID BIGINT, USUARIO_ID BIGINT, PRIMARY KEY (ID))
CREATE TABLE SECCION (ID BIGINT NOT NULL, EDADMAXIMA INTEGER, EDADMINIMA INTEGER, NOMBRE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE USUARIO (ID BIGINT NOT NULL, DTYPE VARCHAR(31), APELLIDOS VARCHAR(255), CALLE VARCHAR(255), CARGO VARCHAR(255), CODIGOPOSTAL VARCHAR(255), DNI VARCHAR(255), EMAIL VARCHAR(255), FECHABAJA DATE, FECHAENTRADA DATE, FECHANACIMIENTO DATE, FOTOPERFIL VARCHAR(255), GENERO VARCHAR(255), LOCALIDAD VARCHAR(255), NOMBRE VARCHAR(255), NOMBREUSUARIO VARCHAR(255), PASSWORD VARCHAR(255), PROVINCIA VARCHAR(255), LISTA_ID BIGINT, APELLIDO1 VARCHAR(255), APELLIDO2 VARCHAR(255), DNI1 VARCHAR(255), DNI2 VARCHAR(255), NOMBRE1 VARCHAR(255), NOMBRE2 VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE HISTORIAL (ID BIGINT NOT NULL, FECHA DATE, FECHATRANSICION_ID BIGINT, SECCION_ID BIGINT, PRIMARY KEY (ID))
CREATE TABLE USUARIO_DOCUMENTO (documentos_ID BIGINT NOT NULL, usuarios_ID BIGINT NOT NULL, PRIMARY KEY (documentos_ID, usuarios_ID))
CREATE TABLE SECCION_EVENTO (eventos_ID BIGINT NOT NULL, secciones_ID BIGINT NOT NULL, PRIMARY KEY (eventos_ID, secciones_ID))
ALTER TABLE ASISTENCIA ADD CONSTRAINT SSTENCIASSTENCIAID FOREIGN KEY (ASISTENCIA_ID) REFERENCES EVENTO (ID)
ALTER TABLE ASISTENCIA ADD CONSTRAINT SISTENCIAUSUARIOID FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (ID)
ALTER TABLE COMENTARIO ADD CONSTRAINT CMNTRIOCMNTARIOSID FOREIGN KEY (COMENTARIOS_ID) REFERENCES EVENTO (ID)
ALTER TABLE COMENTARIO ADD CONSTRAINT COMENTARIOSUARIOID FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (ID)
ALTER TABLE DOCUMENTO ADD CONSTRAINT DOCUMENTOEVENTOSID FOREIGN KEY (EVENTOS_ID) REFERENCES EVENTO (ID)
ALTER TABLE PAGOCUOTA ADD CONSTRAINT PAGOCUOTAUSUARIOID FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (ID)
ALTER TABLE PAGOCUOTA ADD CONSTRAINT PGCUOTAPGOSCUOTAID FOREIGN KEY (PAGOSCUOTA_ID) REFERENCES CUOTA (ID)
ALTER TABLE USUARIO ADD CONSTRAINT USUARIO_LISTA_ID FOREIGN KEY (LISTA_ID) REFERENCES SECCION (ID)
ALTER TABLE HISTORIAL ADD CONSTRAINT HISTORIALSECCIONID FOREIGN KEY (SECCION_ID) REFERENCES SECCION (ID)
ALTER TABLE HISTORIAL ADD CONSTRAINT HSTRLFCHTRNSCIONID FOREIGN KEY (FECHATRANSICION_ID) REFERENCES USUARIO (ID)
ALTER TABLE USUARIO_DOCUMENTO ADD CONSTRAINT SRDCUMENTOdcmntsID FOREIGN KEY (documentos_ID) REFERENCES DOCUMENTO (ID)
ALTER TABLE USUARIO_DOCUMENTO ADD CONSTRAINT SRODOCUMENTOsrosID FOREIGN KEY (usuarios_ID) REFERENCES USUARIO (ID)
ALTER TABLE SECCION_EVENTO ADD CONSTRAINT SCCONEVENTOvntosID FOREIGN KEY (eventos_ID) REFERENCES EVENTO (ID)
ALTER TABLE SECCION_EVENTO ADD CONSTRAINT SCCNEVENTOsccnesID FOREIGN KEY (secciones_ID) REFERENCES SECCION (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
