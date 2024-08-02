-- Database: Smartphone

-- DROP DATABASE IF EXISTS "Smartphone";

CREATE DATABASE "Smartphone"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE TABLE Model(
    ID INT PRIMARY KEY,
    Brand VARCHAR(15),
    Model VARCHAR(50),
    Operating_System VARCHAR(15),
	Operating_System_Support_Years INT,
	
    RAM_GB INT,
	
    Storage_GB INT,
	
	Camera_Primary_Megapixels DECIMAL(3, 1),
	Camera_Wide_Megapixels DECIMAL(3, 1),
	Camera_Macro_Megapixels DECIMAL(3, 1),
	Camera_Digital_Zoom BOOLEAN,
	Camera_Optical_Zoom BOOLEAN, 
	
    Screen_Size_Inches DECIMAL(3, 1),
	Screen_Type VARCHAR(15),
	Screen_FPS_Hz INT,
	Screen_Bright_Nits VARCHAR(15),
	Battery_Size_mAh INT,
	Battery_Autonomy_Hours VARCHAR(8),
	
    Processor_Model VARCHAR(50),
	Processor_Simple_Use BOOLEAN,
	Processor_Common_Use BOOLEAN,
	Processor_Gamming_Use BOOLEAN,
	Processor_Hign_End_Use BOOLEAN,
	
	Durability_Panda_Glass BOOLEAN,
	Durability_Gorilla_Glass_3 BOOLEAN,
	Durability_Gorilla_Glass_5 BOOLEAN,
	Durability_Gorilla_Glass_Victus BOOLEAN,
	Durability_Splash_Resistance BOOLEAN,
	Durability_Water_Resistance BOOLEAN,

	AdditionalResource_NFC BOOLEAN,
	AdditionalResource_Wireless_Charge BOOLEAN,
	AdditionalResource_Reverse_Wireless_Charge BOOLEAN,
	AdditionalResource_Fingerprint_Sensor BOOLEAN,

    Price_Lowest DECIMAL(7, 2),
	Price_Highest DECIMAL(7, 2)
);

select * from model

