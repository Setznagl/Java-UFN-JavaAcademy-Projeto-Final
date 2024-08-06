-- Creating smartphone Model table
--(Must be executed after "databaseCreationSmartphoneScript.sql" and "databaseCreationSystemUserScript.sql")

-- This script can be used directly on PostgreSQL or here, with runner tools

CREATE TABLE Model(
    id SERIAL PRIMARY KEY,
    Brand VARCHAR(15) NOT NULL ,
    Model VARCHAR(15) NOT NULL ,
    CommercialName VARCHAR(15) NOT NULL ,
    Operating_System VARCHAR(15) NOT NULL ,
	Operating_System_Support_Years INT NOT NULL ,
	
    RAM_GB INT NOT NULL ,
    RAM_Expansible BOOLEAN NOT NULL,
    RAM_With_Expansible INT,
	
    Storage_GB INT NOT NULL ,
	
	Camera_Primary_Megapixels DECIMAL(3, 1) NOT NULL ,
	Camera_Wide_Megapixels DECIMAL(3, 1),
	Camera_Macro_Megapixels DECIMAL(3, 1),
	Camera_Digital_Zoom BOOLEAN NOT NULL ,
	Camera_Optical_Zoom BOOLEAN NOT NULL ,
	
    Screen_Size_Inches DECIMAL(3, 1) NOT NULL ,
	Screen_Type VARCHAR(15) NOT NULL ,
	Screen_FPS_Hz INT NOT NULL ,
	Screen_Bright_Nits VARCHAR(15) NOT NULL ,

	Battery_Size_mAh INT NOT NULL ,
	Battery_Autonomy_Hours VARCHAR(8) NOT NULL ,
    Battery_Full_Charge_Hours INT NOT NULL,
    Battery_Charging_Potency_Watts INT NOT NULL,
	
    Processor_Model VARCHAR(50) NOT NULL,
	Processor_Simple_Use BOOLEAN NOT NULL,
	Processor_Common_Use BOOLEAN NOT NULL,
	Processor_Gaming_Use BOOLEAN NOT NULL,
	Processor_High_End_Use BOOLEAN NOT NULL,
	
	Durability_Panda_Glass BOOLEAN NOT NULL,
	Durability_Gorilla_Glass_3 BOOLEAN NOT NULL,
	Durability_Gorilla_Glass_5 BOOLEAN NOT NULL,
	Durability_Gorilla_Glass_Victus BOOLEAN NOT NULL,
	Durability_Splash_Resistance BOOLEAN NOT NULL,
	Durability_Water_Resistance BOOLEAN NOT NULL,

	AdditionalResource_NFC BOOLEAN NOT NULL,
    AdditionalResource_Expansible_Storage BOOLEAN NOT NULL,
	AdditionalResource_Wireless_Charge BOOLEAN NOT NULL,
	AdditionalResource_Reverse_Wireless_Charge BOOLEAN NOT NULL,
	AdditionalResource_Fingerprint_Sensor BOOLEAN NOT NULL,

    Price_Lowest DECIMAL(7, 2) NOT NULL,
	Price_Highest DECIMAL(7, 2) NOT NULL
);

select * from model

