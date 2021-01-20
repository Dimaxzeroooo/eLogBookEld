package com.local.db;


public class ConstantsKeys {

    // Driver Log params
    public static String DriverLogId        = "DriverLogId";
    public static String DriverId           = "DriverId";
    public static String DriverID           = "DriverID";
    public static String CoDriverKey        = "CoDriverKey";

    public static String ProjectId          = "ProjectId";
    public static String DriverStatusId     = "DriverStatusId";

    public static String startDateTime      = "StartDateTime";
    public static String endDateTime        = "EndDateTime";
    public static String utcStartDateTime   = "UTCStartDateTime";
    public static String utcEndDateTime     = "UTCEndDateTime";

    public static String totalMin           = "TotalHours";

    public static String TotalHours         = "TotalHours";
    public static String Duration           = "Duration";
    public static String StartLatitude      = "StartLatitude";
    public static String StartLongitude     = "StartLongitude";
    public static String EndLatitude        = "EndLatitude";
    public static String EndLongitude       = "EndLongitude";

    public static String YardMove           = "YardMove";
    public static String Personal           = "Personal";
    public static String IsEdited           = "IsEdited";

    public static String CycleChangeType    = "CycleChangeType";
    public static String CurrentCycleId     = "CurrentCycleId";
    public static String IsViolation        = "IsViolation";
    public static String IsInternet         = "IsInternet";


    public static String ViolationReason        = "ViolationReason";
    public static String createdDate            = "CreatedDate";
    public static String IsShortHaulException   = "IsShortHaulException";
    public static String IsShortHaulUpdate      = "IsShortHaulUpdate";
    public static String IsAdverseException     = "IsAdverseException";
    public static String isIsShortHaulException = "isIsShortHaulException";
    public static String isIsAdverseException   = "isIsAdverseException";
    public static String AdverseExceptionRemarks= "AdverseExceptionRemarks";


    public static String DriverName         = "DriverName";
    public static String Remarks            = "Remarks";
    public static String StartLocation      = "StartLocation";
    public static String EndLocation        = "EndLocation";
    public static String Truck              = "Truck";
    public static String Trailor            = "Trailor";
    public static String UserName           = "UserName";

    public static String rulesVersion       = "rulesVersion";
    public static String ChkDateTime        = "ChkDateTime";

    public static String City               = "City";
    public static String State              = "State";
    public static String Country            = "Country";

    public static String Inspection            = "Inspection";
    public static String InspectionIssueTypeId = "InspectionIssueTypeId";
    public static String IssueName             = "IssueName";
    public static String Type                  = "Type";
    public static String TruckIssueList        = "InspectionTruckIssueType";
    public static String TrailorIssueList      = "InspectionTrailorIssueType";
    public static String Text                  = "Text";
    public static String Selected              = "Selected";

    public static String UTCDateTime            = "UTCDateTime";
    public static String TrailorNumber          = "TrailorNumber";
    public static String TruckNumber            = "TruckNumber";
    public static String IsYardMove             = "IsYardMove";
    public static String IsPersonal             = "IsPersonal";

    public static String SendLog                = "SendLog";
    public static String ViewCertifyDays        = "ViewCertifyDays";
    public static String EditDays               = "EditDays";
    public static String LogDate                = "LogDate";
    public static String SignImage              = "SignImage";
    public static String StringImage            = "StringImage";
    public static String IsSignCopy             = "IsSignCopy";
    public static String IsCertifyMandatory     = "IsCertifyMandatory";
    public static String IsNotificationAllowed  = "IsAutoDutyNotificationAllowed";

    public static String EditedReason           = "EditedReason";
    public static String TruckIssues            = "TruckIssues";
    public static String TrailerIssues          = "TrailerIssues";
    public static String TruckCtPatIssues       = "TruckCtPatIssues";
    public static String TrailerCtPatIssues     = "TrailerCtPatIssues";
    public static String IsManualAppDownload    = "IsManualAppDownload";
    public static String IsDeviceDebugLogEnable = "IsDeviceDebugLogEnable";



    // --------------------- Shipment params -------------------------
    public static String CoDriverId             = "CoDriverId";
    public static String DeviceId               = "DeviceId";
    public static String DeviceID               = "DeviceID";

    public static String shippingdate           = "shippingdate";
    public static String ShippingSavedDate      = "ShippingSavedDate";
    public static String ShippingDocDate        = "ShippingDocDate";
    public static String ShippingDocumentNumber = "ShippingDocumentNumber";
    public static String Commodity              = "Commodity";
    public static String ShipperName            = "ShipperName";
    public static String FromAddress            = "ShipperState";
    public static String ToAddress              = "ShipperPostalCode";
    public static String IsPosted               = "isPosted";
    public static String IsShippingCleared      = "IsShippingCleared";
    public static String IsUpdateRecord         = "IsUpdateRecord";
    public static String ShipperPostalCode      = "ShipperPostalCode";
    public static String ShipperState           = "ShipperState";
    public static String IsEmptyLoad            = "IsEmptyLoad";
    public static String ShipperDocDateStr      = "ShipperDocDateStr";

    // --------------------- Odometer params -------------------------
    public static String VIN                    = "VIN";
    public static String StartOdometer          = "StartOdometer";
    public static String EndOdometer            = "EndOdometer";
    public static String DistanceType           = "DistanceType";
    public static String IsEditOdometer         = "IsEditOdometer";
    public static String TruckOdometerId        = "TruckOdometerId";
    public static String CreatedDate            = "CreatedDate";
    public static String TotalMiles             = "TotalMiles";
    public static String TotalKM                = "TotalKM";
    public static String TruckEquipmentNumber   = "TruckEquipmentNumber";
    public static String VehicleNumber          = "VehicleNumber";
    public static String DriverStatusID         = "DriverStatusID";
    public static String UTCStartDateTime       = "UTCStartDateTime";
    public static String UTCEndDateTime         = "UTCEndDateTime";


    // --------------------- Inspection params -------------------------
    public static String CompanyId                      = "CompanyId";
    public static String VehicleId                      = "VehicleId";
    public static String TrailorId                      = "TrailorId";
    public static String VehicleEquNumber               = "VehicleEquNumber";
    public static String TrailorEquNumber               = "TrailorEquNumber";
    public static String InspectionDateTime             = "InspectionDateTime";
    public static String InspectionId                   = "InspectionId";
    public static String Location                       = "Location";
    public static String PreTripInspectionSatisfactory  = "PreTripInspectionSatisfactory";
    public static String PostTripInspectionSatisfactory = "PostTripInspectionSatisfactory";
    public static String AboveDefectsCorrected          = "AboveDefectsCorrected";
    public static String AboveDefectsNotCorrected       = "AboveDefectsNotCorrected";
    public static String Latitude                       = "Latitude";
    public static String Longitude                      = "Longitude";
    public static String DriverTimeZone                 = "DriverTimeZone";
    public static String SupervisorMechanicsName        = "SupervisorMechanicsName";
    public static String TruckIssueType                 = "TruckIssueType";
    public static String TraiorIssueType                = "TraiorIssueType";
    public static String DriverSign                     = "DriverSign";
    public static String SupervisorSign                 = "SupervisorSign";
    public static String DeviceName                     = "DeviceName";
    public static String IsStatusAutomatic              = "IsStatusAutomatic";
    public static String OBDSpeed                       = "OBDSpeed";
    public static String GPSSpeed                       = "GPSSpeed";
    public static String PlateNumber                    = "PlateNumber";
    public static String HaulHourException              = "HaulHourException";
    public static String Carrier                        = "Carrier";
    public static String CarrierName                    = "CarrierName";
    public static String DecesionSource                 = "DecesionSource";
    public static String PersonalUse75Km                = "PersonalUse75Km";
    public static String IsAOBRDAutomatic               = "IsAOBRDAutomatic";
    public static String IsAutoDriving                  = "IsAutoDriving";
    public static String IsDrivingShippingAllowed       = "IsDrivingShippingAllowed";
    public static String IsTimestampEnabled             = "IsTimestampEnabled";

    public static String IsUnidentified                 = "IsUnidentified";
    public static String IsMalfunction                  = "IsMalfunction";
    public static String IsDiagnostic                   = "IsDiagnostic";
    public static String SuggestedEdit                  = "SuggestedEdit";

    public static String ShippingDocNumberId            = "ShippingDocNumberId";
    public static String ShipperCity                    = "ShipperCity";
    public static String ServerDate                     = "ServerDate";
    public static String IsUnloading                    = "IsUnloading";
    public static String ShipperAddress                 = "ShipperAddress";

    public static String suggested_data                 = "suggested_data";

    public static String EventDateTime                  = "EventDateTime";
    public static String EngineHours                    = "EngineHours";
    public static String Miles                          = "Miles";
    public static String DetectionDataEventCode         = "DetectionDataEventCode";
    public static String MasterDetectionDataEventId     = "MasterDetectionDataEventId";
    public static String EventCode                      = "EventCode";
    public static String EventName                      = "EventName";
    public static String array                          = "array";
    public static String list                           = "list";
    public static String Reason                         = "Reason";
    public static String MalfunctionDefinition          = "MalfunctionDefinition";
    public static String FromDateTime                   = "FromDateTime";
    public static String ToDateTime                     = "ToDateTime";
    public static String DriverZoneEventDate            = "DriverZoneEventDate";
    public static String SEQUENCE_NO                    = "SEQUENCE_NO";
    public static String Id                             = "Id";
    public static String Definition                     = "Definition";

    public static String ArrivalSealNumber              = "ArrivalSealNumber";
    public static String DepartureSealNumber            = "DepartureSealNumber";
    public static String SecurityInspectionPersonName   = "SecurityInspectionPersonName";
    public static String FollowUpInspectionPersonName   = "FollowUpInspectionPersonName";
    public static String AffixedSealPersonName          = "AffixedSealPersonName";
    public static String VerificationPersonName         = "VerificationPersonName";
    public static String ByteInspectionConductorSign    = "ByteInspectionConductorSign";
    public static String ByteFollowUpConductorSign      = "ByteFollowUpConductorSign";
    public static String ByteSealFixerSign              = "ByteSealFixerSign";
    public static String ByteSealVerifierSign           = "ByteSealVerifierSign";

    public static String SecurityInspectionPersonSignature    = "SecurityInspectionPersonSignature";
    public static String FollowUpInspectionPersonSignature    = "FollowUpInspectionPersonSignature";
    public static String AffixedSealPersonSignature           = "AffixedSealPersonSignature";
    public static String VerificationPersonSignature          = "VerificationPersonSignature";


    public static String InspectionTypeId               = "InspectionTypeId";
    public static String ByteDriverSign                 = "ByteDriverSign";
    public static String DriverSignature                = "DriverSignature";
    public static String ByteSupervisorSign             = "ByteSupervisorSign";
    public static String SupervisorMechanicsSignature   = "SupervisorMechanicsSignature";

    public static String InspectionTruckIssueType       = "InspectionTruckIssueType";
    public static String InspectionTrailorIssueType     = "InspectionTrailorIssueType";


    public static String LogSignImage                   = "LogSignImage";
    public static String LogSignImageInByte             = "LogSignImageInByte";
    public static String CoDriverName                   = "CoDriverName";
    public static String EngineMileage                  = "EngineMileage";
    public static String Date                           = "Date";
    public static String IsRecertifyRequied             = "IsRecertifyRequied";

    public static String CycleDaysDriverLogModel        = "CycleDaysDriverLogModel";
    public static String DriverLogModel                 = "DriverLogModel";

    public static String Day                            = "Day";
    public static String HoursWorked                    = "HoursWorked";

    public static String UTCDate                        = "UTCDate";

    /*=================== Support Constant =================== */
    public static String SupportDetailId                = "SupportDetailId";
    public static String SupportKey                     = "Key";
    public static String SupportValue                   = "Value";
    public static String SupportKeyType                 = "KeyType";
    public static String SupportIsActive                = "IsActive";
    public static String SupportCreateDate              = "CreatedDate";


    /*=================== Driver Permissions Constant =================== */
    public static String OffDutyKey                     = "OffDuty";
    public static String SleeperKey                     = "Sleeper";
    public static String DrivingKey                     = "Driving";
    public static String OnDutyKey                      = "OnDuty";
    public static String LocationKey                    = "Location";

    public static String RecordType                     = "RecordType";
    public static String RecordValue                    = "RecordValue";


    public static String StartDate                      = "StartDate";
    public static String StartLat                       = "StartLat";
    public static String StartLon                       = "StartLon";

    public static String EndDate                        = "EndDate";
    public static String EndLat                         = "EndLat";
    public static String EndLon                         = "EndLon";




    /*=================== Driver Notification History Constant =================== */
    public static String NotificationLogId              = "NotificationLogId";
    public static String NotificationTypeId             = "NotificationTypeId";
    public static String NotificationTypeName           = "NotificationTypeName";
    public static String Title                          = "Title";
    public static String Message                        = "Message";
    public static String ImagePath                      = "ImagePath";
    public static String SendDate                       = "SendDate";
    public static String Status                         = "Status";
    public static String Data                           = "Data";
    public static String DriverLogDate                  = "DriverLogDate";
    public static String SuggestedEditModel             = "SuggestedEditModel";


    // ELD Rule Inputs

    public static String CurrentDateTime                = "CurrentDateTime";
    public static String CurrentUTCTime                 = "CurrentUTCTime";
    public static String  OffsetFromUTC                 = "OffsetFromUTC";
    public static String IsSingleDriver                 = "IsSingleDriver";
    public static String DriverJobStatus                = "DriverJobStatus";
    public static String IsOldRecord                    = "IsOldRecord";
    public static String Is16hrHaulException            = "Is16hrHaulException";
    public static String ViolationTest                  = "ViolationTest";
    public static String ELDCycleFile                   = "ELDCycleFile";
    public static String ALS_OBD_LOG                    = "als_obd_log";
    public static String APP_USAGE_LOG                  = "app_usage_log";
    public static String EXECUTION_TIME_LOG             = "execution_time_Log";
    public static String WIRED_OBD_SERVER_LOG           = "obd_server_log";

    public static String Version                        = "Version";
    public static String Heading                        = "Heading";
    public static String DocumentNumber                 = "DocumentNumber";
    public static String ServerDateTime                 = "ServerDateTime";
    public static String ELDFilePath                    = "ELDFilePath";


    public static String AlsSendingData                 = "AlsSendingData";
    public static String AlsReceivedData                = "AlsReceivedData";
    public static String MobileUsage                    = "MobileUsage";
    public static String TotalUsage                     = "TotalUsage";

    public static String MemoryUsage                    = "MemoryUsage";
    public static String CpuUsage                       = "CpuUsage";
    public static String ExecutionTime                  = "ExecutionTime";
    public static String Date_Time                      = "DateTime";

    public static String EquipmentNumber                = "EquipmentNumber";
    public static String TotalKm                        = "TotalKm";
    public static String StartDateTime                  = "StartDateTime";
    public static String EndDateTime                    = "EndDateTime";
    public static String StatusId                       = "StatusId";
    public static String CompanyStartDateTime           = "CompanyStartDateTime";
    public static String CompanyEndDateTime             = "CompanyEndDateTime";

    public static String IsShowOnMobileApp              = "IsShowOnMobileApp";
    public static String NewsTitle                      = "NewsTitle";
    public static String NewsDescription                = "NewsDescription";

    public static String UnAssignedVehicleMilesId       = "UnAssignedVehicleMilesId";
    public static String AssignedUnidentifiedRecordsId  = "AssignedUnidentifiedRecordsId";
    public static String RejectionRemarks               = "RejectionRemarks";
    public static String Unidentified                   = "Unidentified";
    public static String CompanyAssigned                = "CompanyAssigned";
    public static String EventList                      = "EventList";

    public static String IsAllowLogReCertification      = "IsAllowLogReCertification";
    public static String IsShowUnidentifiedRecords      = "IsShowUnidentifiedRecords";
    public static String IsAllowMalfunction             = "IsAllowMalfunction";
    public static String IsAllowDiagnostic              = "IsAllowDiagnostic";
    public static String IsClearMalfunction             = "IsClearMalfunction";
    public static String IsClearDiagnostic              = "IsClearDiagnostic";


}
