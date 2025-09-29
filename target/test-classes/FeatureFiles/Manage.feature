Feature: Login into Capium Application
Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Corporation tax five point zero
  
    
  Scenario: click on manage and verify all options
  Given Click on ManageDashboard
  Then verify and select client 
  Then verify and select users 
  Then verify and select import 
  Then verify and select export 
  Then verify and select permission
  
  #Scenario: creating a new user and send an invite
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And   Click on Adduser
  #And   Enter firstmiddleand lastname
  #And Select Administrator from dropdown
  #And Enter Addresss and city and country 
  #And Enter postal Zipcode 
  #And  Click on Save and Invite
  #Scenario: creating a new user and send an invite by using mandandatory fields
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And   Click on Adduser
  #And   Enter firstname and email
  #And Select Administrator from dropdown
  #And  Click on Save and Invite 
  #Scenario: creating a new user using save button
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And  Click on Adduser
  #And  Enter firstmiddleand lastname
  #And Select Administrator from dropdown
  #And Enter Addresss and city and country 
  #And Enter postal Zipcode 
  #And  Click on SaveButtonInUsers
  
  
  #Scenario: creating a new user and using save and exit button
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And  Click on Adduser
  #And  Enter firstmiddleand lastname
  #And Select Administrator from dropdown
  #And Enter Addresss and city and country 
  #And Enter postal Zipcode 
  #And  Click on Saveandexit button in users
  
  
  
  #Scenario: creating a RegularUser and using save and invitebutton
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And  Click on Adduser
  #And  Enter firstmiddleand lastname
  #And Select RegularUser from dropdown
  #And Enter Addresss and city and country 
  #And Enter postal Zipcode 
  #And  Click on Saveandexit button in users
  
  
  #Scenario: creating a Manager and using save and invitebutton
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And  Click on Adduser
  #And  Enter firstmiddleand lastname
  #And Select Manager from dropdown
  #And Enter Addresss and city and country 
  #And Enter postal Zipcode 
  #And  Click on Saveandexit button in users
  
  
  #Scenario: creating a Manager and using save and invitebutton
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And  Click on Adduser
  #And  Enter firstmiddleand lastname
  #And Select Manager from dropdown
  #And Enter Addresss and city and country 
  #And Enter postal Zipcode 
  #And  Click on Saveandexit button in users
  
  
  
  #Scenario: Verify cancel changes button in Users
  #Given Click on ManageDashboard
  #Then verify and select users 
  #And  Click on Adduser
  #And  Enter firstmiddleand lastname
  #And Select Administrator from dropdown
  #And Enter Addresss and city and country 
  #And Enter postal Zipcode 
  #And  Click on Cancel changes button in users
  
  
    #Scenario:  user  assigns clients
    #Given Click on ManageDashboard
    #When  Click on users option
    #Given Click on id checkbox
    #When  Click on the edit button for a specific user
    #And   Click on Assign clients
    #And   Select the checkbox for a specific client
    #And   Click on Save button
    #Then  Should see a confirmation message "Permissions updated successfully
    
  #Scenario: Verify Status all dropdown
  #Given Click on ManageDashboard
  #When  Click on users option
  #When click on status all dropdown 
  #And click on active 
  #And click on Resend invitation
  #And  click on invite 
  #And click on archieved 
  
  #Scenario: Verify export to excel using kebab icon
  #Given Click on ManageDashboard
  #When  Click on users option
  #When  Click on kebab icon 
  #And   Click on export to excel
   
  #Scenario: Verify export to CSV using kebab icon
  #Given Click on ManageDashboard
  #When  Click on users option
  #When  Click on kebab icon 
  #And   Click on export to CSV
  #When  Click on kebab icon 
  #And   Click on export to PDF
  #When  Click on kebab icon 
  #And   Click on export to excel
  
  
   #Scenario: Verify export to PDF using kebab icon
   #Given Click on ManageDashboard
   #When  Click on users option
   #When  Click on kebab icon 
   #And   Click on export to PDF
 
   
   #Scenario: Verify search functionality
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on search textfield and enter the text
   
   #Scenario: Verify delete option functionality in add users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #Then  Click on UserCheckbox
   #And   Click on delete button 
   
   #Scenario: Verify delete option functionality in add users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #Then  Click on UserCheckbox
   #And   Click on delete button for no option
  
  
   #Scenario: Verify profile uploading functionality
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Choose a file
   
   #Scenario: Verify profile deletion functionality
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Choose a file
   #And   Click on DeletePhoto
   
   
   #Scenario: Verify user export as print
   #Given Click on ManageDashboard
   #When  Click on users option
   #Then  Click on checkbox of specific user
   #And   Click on options as Print
   
   #Scenario: Verify ExportAsExcel option functionality in add users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #Then  Click on UserCheckbox
   #And   Click on ExportAsExcelInAddUsers
  #
  #Scenario: Verify ExportAsCSV option functionality in add users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #Then  Click on UserCheckbox
   #And   Click on ExportAsCSVInAddUsers
  #
  Scenario: Verify ExportAsPDF option functionality in add users tab
   Given Click on ManageDashboard
   When  Click on users option
   And   Click on Adduser
   Then  Click on UserCheckbox
   And   Click on ExportAsPDFInAddUsers
   
   Scenario: Verify delete option functionality in Users tab
   Given Click on ManageDashboard
   When  Click on users option
   Then  Click on UserCheckboxInUsersTab
   And   Click on deleteInUsers button
   
   
   
   #
   #Scenario: Verify ExportAsExcel option functionality in Users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #Then  Click on UserCheckboxInUsersTab
   #And   Click on ExportAsExcelInUsers
  #
   #
   #Scenario: Verify ExportAsCSV option functionality in Users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #Then  Click on UserCheckboxInUsersTab
   #And   Click on ExportAsCSVInUsers
   #
   #Scenario: Verify ExportAsPDF option functionality in Users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #Then  Click on UserCheckboxInUsersTab
   #And   Click on ExportAsPDFInUsers
  #
   #
   #Scenario: Verify Cross button functionality in Users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #Then  Click on UserCheckboxInUsersTab
   #And   Click on Cross button in users tab   
   #
   #Scenario: Verify CancelSelection functionality in Users tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #Then  Click on UserCheckboxInUsersTab
   #And   Click on Cancel Selection in users tab   
   #
   #
   #Scenario: Verify CancelSelection functionality in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #Then  Click on UserCheckbox
   #And   Click on Cancel Selection in Addusers tab   
   #
    #
   #Scenario: Verify Cross button functionality in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #Then  Click on UserCheckbox
   #And   Click on Cross button in Addusers tab 
   #
   #Scenario: Verify Edit Permissions section to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions
   #
   #Scenario: Expand tax return section to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on tax return arrow in add users
   #
   #Scenario: Expand Quick return section to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on Quick return arrow in add users
   
    
   #Scenario: Expand Calculator in Quick entry section to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on Quick return arrow in add users
   #And   Click on Calculator arrow in quick entry 
   
   
   #Scenario: Expand attachments in Quick entry section to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on Quick return arrow in add users
   #And   Click on Attachment arrow in quick entry 
   
   
   #Scenario: Expand Reports in Quick entry section to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on Quick return arrow in add users
   #And   Click on Reports arrow in quick entry 
   
   
   #Scenario: Expand Manage Arrow to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on Manage arrow in quick entry 
   
   #Scenario: Expand calculator Arrow to view its permissions in AddUsers tab
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on Calculator arrow in add users
   
   
   #Scenario: Verify view RadioButton in edit permissions
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on View RadioButton Of Taxreturn
   
   
   #Scenario: Verify view RadioButton and save button in edit permissions
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on View RadioButton Of Taxreturn
   #And   Click on Save Button
   
   
   #Scenario: Verify CancelButton in edit permissions
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on CancelButton 
   
   #Scenario: Verify CancelButton in edit permissions
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on CancelButton 
   
   
   #Scenario: Verify Reset to Default in edit permissions
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on View RadioButton Of Taxreturn
   #And   Click on Reset to Default
   
   
   #Scenario: Verify Close icon in edit permissions
   #Given Click on ManageDashboard
   #When  Click on users option
   #And   Click on Adduser
   #And   Click on Edit Permissions 
   #And   Click on Close icon
  