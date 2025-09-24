Feature: Verify export to CSV
Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Corporation tax five point zero
  
  #Scenario: Expand tax return section to view its permissions 
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #And Click on Tax Return arrow
  #And Click on View checkbox
 
 
  #Scenario: Exapnd Quickentry section to view its permissions 
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #And Click on  Quickentry arrow
 
  #Scenario: Expand Calculator in Quick entry section to view its permissions 
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #And Click on  Quickentry arrow
  #And Click on Calculator arrow
  
  #Scenario: Expand Attachments in Quick entry section to view its permissions 
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #And Click on  Quickentry arrow
  #And Click on  Attachments arrow
 
  #Scenario: Expand Reports in Quick entry section to view its permissions 
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #And Click on  Quickentry arrow
  #And Click on  Reportss arrow
 
  #Scenario: Expand Manage section to view its permissions 
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #And Click on  Manage_arrow
  
  #Scenario: Expand Calculator Section to view its permissions 
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #And Click on  CalculatorArrow
  
  #Scenario: Verify search textfield in permissions
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #Then  Click on Search textfield and Enter the permission
  
  #Scenario: Verify Savebutton
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #Then give permission access as view for managerAccess in QuickEntry
  #And Click on SaveButtton
  
  #Scenario: Verify SaveAndExitButton
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #Then give permission access as view for managerAccess in QuickEntry
  #And Click on SaveAndExitButton
  
  #Scenario: Verify CancelChangesButton
  #Given Click on ManageDashBoard
  #When  Click on  Permissions
  #Then give permission access as view for managerAccess in QuickEntry
  #And Click on CancelChangesButton
  
  #Scenario: verify import with clients
  #Given Click on ManageDashBoard
  #And  Click on import of manage screen
  #And Click on clients radiobutton of import
  #And Click on Next of import
  #And Click on Browse of import
  #And Click on NextButton after browse
  #And Click on save and Next of import
  
   #EXPORT AS EXCEL FOR CLIENTS
   #Scenario: verify Download excel of client using ALL week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And  Select All  from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   
   Scenario: verify Download excel of client using This week data range
   Given Click on ManageDashBoard
   And   Click on Export of manage screen
   And   Select This week from dropdown from export
   And Click on clients radiobutton of import  
   And Click on Excel of Export screen
   And Click on export button of Export Screen
   
   Scenario: verify Download excel of client using Last week data range
   Given Click on ManageDashBoard
   And   Click on Export of manage screen
   And   Select Last week from dropdown from export
   And Click on clients radiobutton of import  
   And Click on Excel of Export screen
   And Click on export button of Export Screen
   
   Scenario: verify Download excel of client using THIS MONTH  data range
   Given Click on ManageDashBoard
   And   Click on Export of manage screen
   And   Select This month from dropdown from export
   And Click on clients radiobutton of import  
   And Click on Excel of Export screen
   And Click on export button of Export Screen
   
   Scenario: verify Download excel of client using LAST MONTH data range
   Given Click on ManageDashBoard
   And   Click on Export of manage screen
   And   Select Last month from dropdown from export
   And Click on clients radiobutton of import  
   And Click on Excel of Export screen
   And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using THIS QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This quarter from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using LAST QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last quarter from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using THIS YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This year from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using LAST YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last year from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using CUSTOM data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select custom from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #EXPORT AS CSV FOR CLIENTS
   
   #Scenario: verify Download excel of client using ALL week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select All  from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using This week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This week from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using Last week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last week from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using THIS MONTH  data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This month from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using LAST MONTH data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last month from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using THIS QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This quarter from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using LAST QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last quarter from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using THIS YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This year from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using LAST YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last year from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of client using CUSTOM data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select custom from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   
   # EXPORT AS PDF
   
   #Scenario: verify Download excel of client using ALL week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select All  from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using This week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This week from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using Last week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last week from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using THIS MONTH  data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This month from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using LAST MONTH data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last month from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using THIS QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This quarter from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using LAST QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last quarter from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using THIS YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This year from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using LAST YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last year from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of client using CUSTOM data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select custom from dropdown from export
   #And Click on clients radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #USERS
    #Scenario: verify Download excel of USERS using ALL week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select All  from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using This week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This week from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using Last week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last week from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using THIS MONTH  data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This month from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using LAST MONTH data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last month from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using THIS QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This quarter from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using LAST QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last quarter from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using THIS YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This year from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using LAST YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last year from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using CUSTOM data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select custom from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on Excel of Export screen
   #And Click on export button of Export Screen
   #
   #EXPORT AS CSV FOR USERS
   
   #Scenario: verify Download excel of USERS using ALL week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select All  from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using This week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This week from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using Last week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last week from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using THIS MONTH  data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This month from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using LAST MONTH data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last month from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using THIS QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This quarter from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using LAST QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last quarter from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using THIS YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This year from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using LAST YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last year from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   #
   #Scenario: verify Download excel of USERS using CUSTOM data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select custom from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on CSV of Export screen
   #And Click on export button of Export Screen
   
   # EXPORT AS PDF
   #
   #Scenario: verify Download excel of USERS using ALL week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select All  from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using This week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This week from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using Last week data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last week from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using THIS MONTH  data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This month from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using LAST MONTH data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last month from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using THIS QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select This quarter from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using LAST QUARTER data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last quarter from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using THIS YEAR data range
   #Given Click on ManageDashBoard
   #And  Click on Export of manage screen
   #And  Select This year from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using LAST YEAR data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select Last year from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   #Scenario: verify Download excel of USERS using CUSTOM data range
   #Given Click on ManageDashBoard
   #And   Click on Export of manage screen
   #And   Select custom from dropdown from export
   #And Click on USERS radiobutton of import  
   #And Click on PDF of Export screen
   #And Click on export button of Export Screen
   
   
   