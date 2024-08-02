-- Creating smartphone Model table (Must be executed after "databaseCreationScript.sql")

-- This script can be used directly on PostgreSQL or here, with runner tools

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
	Processor_Gaming_Use BOOLEAN,
	Processor_High_End_Use BOOLEAN,
	
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

