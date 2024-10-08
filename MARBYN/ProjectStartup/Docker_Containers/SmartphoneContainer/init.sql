CREATE TABLE Smartphone
(
    id                                         SERIAL PRIMARY KEY,

    brand                                      VARCHAR(20) NOT NULL UNIQUE,
    model                                      VARCHAR(20) NOT NULL UNIQUE,
    CommercialName                             VARCHAR(50) NOT NULL,
    Operating_System                           VARCHAR(15) NOT NULL,
    Operating_System_Support_Years             INTEGER     NOT NULL,
    RAM_GB                                     INTEGER     NOT NULL,
    Is_The_Ram_Expansible                      BOOLEAN     NOT NULL,
    RAM_With_Expansible                        INTEGER,
    Storage_GB                                 INTEGER     NOT NULL,
    Camera_Primary_Megapixels                  INTEGER     NOT NULL,
    Camera_Wide_Megapixels                     INTEGER     NOT NULL,
    Camera_Macro_Megapixels                    INTEGER     NOT NULL,
    Camera_Have_Digital_Zoom                   BOOLEAN     NOT NULL,
    Camera_Have_Optical_Zoom                   BOOLEAN     NOT NULL,
    Screen_Size_Inches                         INTEGER     NOT NULL,
    Screen_Type                                VARCHAR(15) NOT NULL,
    Screen_FPS_Hz                              INTEGER     NOT NULL,
    Screen_Bright_Nits                         INTEGER     NOT NULL,
    Battery_Size_mAh                           INTEGER     NOT NULL,
    Battery_Autonomy_Hours                     VARCHAR(8)  NOT NULL,
    Battery_Full_Charge_Hours                  VARCHAR(8)  NOT NULL,
    Delivered_Charging_Potency_Watts           INTEGER     NOT NULL,
    Battery_Charging_Potency_Watts             INTEGER     NOT NULL,
    Processor_Model                            VARCHAR(50) NOT NULL,
    Processor_Simple_Use                       BOOLEAN     NOT NULL,
    Processor_Common_Use                       BOOLEAN     NOT NULL,
    Processor_Gaming_Use                       BOOLEAN     NOT NULL,
    Processor_High_End_Use                     BOOLEAN     NOT NULL,
    Durability_Panda_Glass                     BOOLEAN     NOT NULL,
    Durability_Gorilla_Glass_3                 BOOLEAN     NOT NULL,
    Durability_Gorilla_Glass_5                 BOOLEAN     NOT NULL,
    Durability_Gorilla_Glass_Victus            BOOLEAN     NOT NULL,
    Durability_Splash_Resistance               BOOLEAN     NOT NULL,
    Durability_Water_Resistance                BOOLEAN     NOT NULL,
    AdditionalResource_NFC                     BOOLEAN     NOT NULL,
    AdditionalResource_Expansible_Storage      BOOLEAN     NOT NULL,
    AdditionalResource_Wireless_Charge         BOOLEAN     NOT NULL,
    AdditionalResource_Reverse_Wireless_Charge BOOLEAN     NOT NULL,
    AdditionalResource_Fingerprint_Sensor      BOOLEAN     NOT NULL,
    Price_Lowest                               BIGINT      NOT NULL,
    Price_Highest                              BIGINT      NOT NULL
);

INSERT INTO Smartphone (brand, model, CommercialName, Operating_System, Operating_System_Support_Years,
                        RAM_GB, Is_The_Ram_Expansible, RAM_With_Expansible, Storage_GB,
                        Camera_Primary_Megapixels, Camera_Wide_Megapixels, Camera_Macro_Megapixels,
                        Camera_Have_Digital_Zoom, Camera_Have_Optical_Zoom, Screen_Size_Inches,
                        Screen_Type, Screen_FPS_Hz, Screen_Bright_Nits, Battery_Size_mAh,
                        Battery_Autonomy_Hours, Battery_Full_Charge_Hours, Delivered_Charging_Potency_Watts,
                        Battery_Charging_Potency_Watts, Processor_Model, Processor_Simple_Use, Processor_Common_Use,
                        Processor_Gaming_Use, Processor_High_End_Use, Durability_Panda_Glass,
                        Durability_Gorilla_Glass_3, Durability_Gorilla_Glass_5, Durability_Gorilla_Glass_Victus,
                        Durability_Splash_Resistance, Durability_Water_Resistance, AdditionalResource_NFC,
                        AdditionalResource_Expansible_Storage, AdditionalResource_Wireless_Charge,
                        AdditionalResource_Reverse_Wireless_Charge, AdditionalResource_Fingerprint_Sensor,
                        Price_Lowest, Price_Highest)
VALUES ('Samsung', 'SM-A055M', 'Galaxy A05 128GB', 'Android', 2,
        4, false, 4, 128,
        50, 0, 2,
        false, false, 6.7,
        'PLS LCD', 60, 500,
        5000, '21H 27M', '2H 30M', 7, 25,
        'TestProcessor', true, false, false,
        false, false, false,
        false, false, false,
        false, false, false,
        false, false, false,
        0, 0);

