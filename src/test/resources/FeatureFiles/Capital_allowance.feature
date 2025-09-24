Feature: Login into Capium Application
 
  Background: User login
    Given Launch the browser
    And  User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Corporation tax five point zero
 
Scenario: Click on the created CT600 Return and navigate to Capital Allowances Calculator excess amount screen.
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     
     
     
     Scenario: Verify Main pool asset with WDV b/fwd amount 
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary
     And Click and Verify CT600 Computation
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Main pool asset with WDV b/fwd amount by using save
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfSaveButton
     
    
     
     Scenario: Verify Main pool asset with WDV b/fwd amount by using cancel changes
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfCancelchanges
     
     
     Scenario: Verify Main pool asset with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary1
     And Click and Verify CT600 Computation1
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
      
     Scenario: Verify Main pool asset with  WDV b/fwd amount and addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for wdv b/fwd and addition amount
     And Click and Verify CT600 Computation for wdv fwd and addition amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify Main pool asset with addition amount and restriction amount 
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Enter  Restriction amount
     And Click on MainPoolOfSaveAndExitButton    
     And Click on Assert Summary for restriction amount
     And Click and Verify CT600 Computation for restriction amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value 
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify Main pool asset with WDV b/fwd amount and restriction amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Enter  Restriction amount
     And Click on MainPoolOfSaveAndExitButton    
     And Click on Assert Summary for wdv and restriction
     And Click and Verify CT600 Computation for wdv and restriction
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify Main pool asset with WDV b/fwd amount and  disposed amount and restriction amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Enter  Restriction amount
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for wdv b/fwd amount adn disposed amount
     And Click and Verify CT600 Computation for wdv b/fwd amount adn disposed amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv b/fwd amount adn disposed amount
     And Click on QuickEntry
     And Delete Assert
     
     
     
     
    
     Scenario: Verify Main pool asset with WDV b/fwd amount and  disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for wdv b/fwd amount and disposed amount
     And Click and Verify CT600 Computation for wdv b/fwd amount and disposed amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Main pool asset with WDV b/fwd amount and  larger disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Select Asset Disposed Date
     And Enter disposal date
     And Enter larger disposed amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary wdv bfwd and larger Disposed amount
     And Click and Verify CT600 Computation wdv bfwd and larger Disposed amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Main pool asset with addition amount and  larger disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Enter larger disposed amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary with AdditionAmount with larger Disposed Amount
     And Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Main pool asset with addition amount and disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary additionAmount and DisposedAmount
     And Click and Verify CT600 ComputationAddition and DisposedAmount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount
     And Click on QuickEntry
     And Delete Assert
       
     Scenario: Verify Main pool asset with addition amount and AIA amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date
     And Enter  Additions
     And Enter AIA Amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary2
     And Click and Verify CT600 Computation2
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value2
     And Click on QuickEntry
     And Delete Assert

     
     Scenario: Verify Main pool asset with addition amount with asset is car Between 75-130g/Km    
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Select asset is a car category
     And Enter Assert Description
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition amount with asset is car Between 75-130g/Km    
     And Click and Verify CT600 Computation addition amount with asset is car Between 75-130g/Km    
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between 75-130g/Km    
     And Click on QuickEntry
     And Delete Assert
     
     
     
       Scenario: Verify Main pool asset with addition amount with asset is car Between 75g/kmorless   
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Select asset is a car category
     And Enter Assert Description
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition amount with asset is car Between 75gkmorlesss    
     And Click and Verify CT600 Computation addition amount with asset is car Between 75gkmorlesss   
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between 75gkmorlesss    
     And Click on QuickEntry
     And Delete Assert
     
 
     
     Scenario: Verify Main pool asset with WDV b/fwd amount with no claim
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on No Claim checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary WDV b/fwd amount with no claim
     And Click and Verify CT600 Computation WDV b/fwd amount with no claim 
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value WDV b/fwd amount with no claim
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Main pool asset with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for addition with no claim
     And Click and Verify CT600 Computation for addition with no claim
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
  
     
     Scenario: Verify Main pool asset with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary1
     And Click and Verify CT600 Computation1
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
  
     
     
     
     Scenario: Verify Main pool asset with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed
     And Click and Verify CT600 Computation addition and disposed with business closed
     And Click on CT600 return from computation
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Delete Assert
       
    
     Scenario: Verify Main pool asset with WDV amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed
     And Click and Verify CT600 Computation addition and disposed with business closed
     And Click on CT600 return from computation
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Delete Assert
     
     Scenario: Verify Main pool asset with WDV amount and claim small pool allowance  
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Click on Claim small pool allowance
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary Of ClaimsmallPOOlAllowance with addition
     And Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition
     And Click on CT600 return from computation
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Delete Assert
       
       
   
     
     
     Scenario: Verify mainpool rate with addition amount  at first year allowance at 100 percent
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Click on first year allowance at 100 percent
     And Enter  Additions 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for electric vehicle charge points
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
   
     Scenario: Verify specialrate asset with WDV b/fwd amount and addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And SelectAsset Category for SpecialRatePool
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Enter  Additions 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary
     And Click and Verify CT600 Computation
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
     
     
     
     Scenario: Verify Main pool asset with addition amount and superdeduction
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return3
     And Click on Capital Allowances calculator screen 
     And Click on Add new asset
     And Enter Assert Description 
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date for superdeduction
     And Enter  Additions 
     And Click on Super deduction at ONETHIRTYPERCENT checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for superdeduction
     And Click and Verify CT600 Computation for superdeduction
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value superdeduction 
     And Click on QuickEntry
     And Delete Assert
     
     
    
    
     
     Scenario: Verify shortlife asset with WDV b/fwd amount 
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for shortlife asset with wdv amount
     And Click and Verify CT600 Computation for shortlife asset with wdv amount
     And Click on MainFormForCapitalAllowance 
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value 
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify shortlife asset with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for shortlife asset with addition amount
     And Click and Verify CT600 Computation for shortlife asset with addition amount
     And Click on MainFormForCapitalAllowance 
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value 
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify shortlife asset with WDV b/fwd amount and  disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for wdv b/fwd amount and disposed amount
     And Click and Verify CT600 Computation for wdv b/fwd amount and disposed amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount
     And Click on QuickEntry
     And Delete Assert
     
    
     
     Scenario: Verify shortlife asset with WDV b/fwd amount and  larger disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Select Asset Disposed Date
     And Enter disposal date
     And Enter larger disposed amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary wdv bfwd and larger Disposed amount
     And Click and Verify CT600 Computation wdv bfwd and larger Disposed amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify shortlife asset with addition amount and  larger disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Enter larger disposed amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary with AdditionAmount with larger Disposed Amount
     And Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify shortlife asset with addition amount and disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary additionAmount and DisposedAmount
     And Click and Verify CT600 ComputationAddition and DisposedAmount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify shortlife asset with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points
     And Click on MainFormForCapitalAllowance 
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify shortlife asset with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select Asset category as short life asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for no claim electric charge vehicle points 
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify SpecialRate asset with WDV b/fwd amount 
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And SelectAsset Category for SpecialRatePool
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for WDV of specialrate
     And Click and Verify CT600 Computation for WDV of specialrate
     And Click on MainFormForCapitalAllowance 
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for WDV of specialrate
     And Click on QuickEntry
     And Delete Assert
     
   
     Scenario: Verify specialrate asset with WDV b/fwd amount and  disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
      And SelectAsset Category for SpecialRatePool
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for wdv b/fwd amount and disposed amount
     And Click and Verify CT600 Computation for wdv b/fwd amount and disposed amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount
     And Click on QuickEntry
     And Delete Assert
     
     Scenario: Verify specialrate asset with WDV b/fwd amount and  larger disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And SelectAsset Category for SpecialRatePool
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Select Asset Disposed Date
     And Enter disposal date
     And Enter larger disposed amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary wdv bfwd and larger Disposed amount
     And Click and Verify CT600 Computation wdv bfwd and larger Disposed amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Main specailrate asset with addition amount and  larger disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And SelectAsset Category for SpecialRatePool
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Enter larger disposed amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary with AdditionAmount with larger Disposed Amount
     And Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify specialrate asset with addition amount and disposed amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary additionAmount and DisposedAmount
     And Click and Verify CT600 ComputationAddition and DisposedAmount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount
     And Click on QuickEntry
     And Delete Assert
    
    
     Scenario: Verify special rate pool with addition amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category for structure and buildings
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points
     And Click on MainFormForCapitalAllowance 
     And Click on Enhanced Expenditure and Verify structure and buildings value
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify special rate pool  with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Zero emission cars
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for no claim electric charge vehicle points 
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for Zero emissions cars 
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify special rate asset with addition amount and restriction amount 
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And SelectAsset Category for SpecialRatePool
     And Select Asset acquisition date 
     And Enter  Additions
     And Enter  Restriction amount
     And Click on MainPoolOfSaveAndExitButton    
     And Click on Assert Summary for restriction amount and addition amount for special rate pool
     And Click and Verify CT600 Computation for restriction amount and addition amount for special rate pool
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure for special rate pool
     And Click on QuickEntry
     And Delete Assert
    
     Scenario: Verify Special rate pool with WDV b/fwd amount and restriction amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And SelectAsset Category for SpecialRatePool
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Enter  Restriction amount
     And Click on MainPoolOfSaveAndExitButton    
     And Click on Assert Summary for restriction and wdv with special rate pool
     And Click and Verify CT600 Computation for restriction and wdv with special rate pool
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure for special rate pool
     And Click on QuickEntry
     And Delete Assert
      
     
     
     Scenario: Verify Structures and buildings asset with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary Of structure and buildings
     And Click and Verify CT600 Computation of structure and buildings
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of strcutures and buildings
     And Click on QuickEntry 
     And Delete Assert
     
   
     Scenario: Verify structure and buildings asset with WDV b/fwd amount 
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select structure and buildings Asset
     And Select Asset acquisition date of previous year
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for structure and buildings
     And Click and Verify CT600 Computation for structure and buildings
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify structure and buildings value
     And Click on QuickEntry
     And Delete Assert
     
      
     Scenario: Verify structure and buildings with  WDV b/fwd amount and addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category for structure and buildings
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for wdv b/fwd and addition amount of structure and buildings
     And Click and Verify CT600 Computation for wdv fwd and addition amount of structure and buildings
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify structure and buildings value
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify structure and buildings with addition amount and restriction amount 
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category for structure and buildings
     And Select Asset acquisition date 
     And Enter  Additions
     And Enter  Restriction amount
     And Click on MainPoolOfSaveAndExitButton    
     And Click on Assert Summary for structure and buildings with addition and restriction amount
     And Click and Verify CT600 Computation for structure and buildings with addition and restriction amount
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify structure and buildings value
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify structure and buildings asset with WDV b/fwd amount and restriction amount
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category for structure and buildings
     And Select Asset acquisition date of previous year
     And Enter WDV b/fwd amount 
     And Enter  Restriction amount
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for structure and buildings with WDV and restriction
     And Click and Verify CT600 Computation for structure and buildings with WDV and restriction
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify structure and buildings value
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify structure and buildings with addition amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category for structure and buildings
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points
     And Click on MainFormForCapitalAllowance 
     And Click on Enhanced Expenditure and Verify structure and buildings value
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify structure and buildings with addition amount with no claim
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category for structure and buildings
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify structure and buildings value
     And Click on QuickEntry
     And Delete Assert
     
     
     
     
     
     
     
     Scenario: Verify Other charges and allowances with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as other charges and allowances
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on first year allowance at 100 percent
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for other charges and allowances
     And Click and Verify CT600 Computation for other charges and allowances
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and verify other charges and allowances
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Other charges and allowances with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as other charges and allowances
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed
     And Click and Verify CT600 Computation addition and disposed with business closed
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and verify other charges and allowances
     And Click on QuickEntry
     And Delete Assert
       
       
     Scenario: Verify Other charges and allowances with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as other charges and allowances
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary1
     And Click and Verify CT600 Computation1
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and verify other charges and allowances
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify Electric vehicle charge points and allowances with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Electric vehicle charge points
     And Select Asset acquisition date 
     And Click on first year allowance at 100 percent
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for electric vehicle charge points
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for electric vehicle charge points   
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify electric vehicle charge points with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Electric vehicle charge points
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points
     And Click on MainFormForCapitalAllowance 
     And Click on Capital allowances and Balancing charges in main for electric vehicle charge points 
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify electric vehicle charge points with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Electric vehicle charge points
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for no claim electric charge vehicle points 
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in mainform for no claim
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify enterpise zone and allowances with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Enterprise zone
     And Select Asset acquisition date 
     And Click on first year allowance at 100 percent
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for electric vehicle charge points
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for enterprise zone   
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify electric vehicle charge points with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Enterprise zone
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points
     And Click on MainFormForCapitalAllowance 
     And Click on Capital allowances and Balancing charges in main for enterprise zone   
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify electric vehicle charge points with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Enterprise zone
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for no claim electric charge vehicle points 
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for enterprise zone   
     And Click on QuickEntry
     And Delete Assert
     
     
    
     Scenario: Verify  with  zero emissions goods vehicle addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Zero emissions goods vehicle
     And Select Asset acquisition date 
     And Click on first year allowance at 100 percent
     And Enter  Additions
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for electric vehicle charge points
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle 
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verifyzero emissions goods vehicle with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Zero emissions goods vehicle
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points
     And Click on MainFormForCapitalAllowance 
     And Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle 
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify zero emissions goods vehicle with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Zero emissions goods vehicle
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for no claim electric charge vehicle points 
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle 
     And Click on QuickEntry
     And Delete Assert
     
       
  
     
     Scenario: Verify ZERO EMISSION CARS  with addition amount
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Zero emission cars
     And Select Asset acquisition date 
     And Click on first year allowance at 100 percent
     And Enter  Additions 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for electric vehicle charge points
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for Zero emissions cars 
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify ZERO EMISSION CARS  with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Zero emission cars
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points
     And Click on MainFormForCapitalAllowance 
     And Click on Capital allowances and Balancing charges in main for Zero emissions cars 
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify ZERO EMISSION CARS  with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Zero emission cars
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for no claim electric charge vehicle points 
     And Click on MainFormForCapitalAllowance
     And Click on Capital allowances and Balancing charges in main for Zero emissions cars 
     And Click on QuickEntry
     And Delete Assert
     
     
     
     Scenario: Verify DESIGNATED ENHANCED ALLOWANCE with addition amount  at first year allowance at 100 percent
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Designated enhnaced allowance
     And Select Asset acquisition date 
     And Click on first year allowance at 100 percent
     And Enter  Additions 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for electric vehicle charge points
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify DESIGNATED ENHNACED ALLOWANCE  with addition amount and disposed amount and business closed checkbox
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Designated enhnaced allowance
     And Select Asset acquisition date 
     And Enter  Additions 
     And Select Asset Disposed Date
     And Enter disposal date
     And Click on BusinessclosedCheckbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary addition and disposal with business closed for electric charge vehicle points 
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance 
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
       
     
     Scenario: Verify DESIGNATED ENHNACED ALLOWANCE with addition amount With NO CLAIM
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category as Designated enhnaced allowance
     And Select Asset acquisition date 
     And Enter  Additions
     And Click on No Claim Checkbox
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary for no claim electric charge vehicle points 
     And Click and Verify CT600 Computation for electric vehicle charge points
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
     Scenario: Verify kebab icon for capital allowance
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on kebeb icon
     And Click on asset wise Details
     And Click on Pool wise Details
     
     
     Scenario: Verify Main pool asset with WDV b/fwd amount 
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfSaveAndExitButton
     And Click on Assert Summary
     And Click and Verify CT600 Computation
     And Click on MainFormForCapitalAllowance
     And Click on Enhanced Expenditure and Verify Machinery and plant Main pool value
     And Click on QuickEntry
     And Delete Assert
     
     
     Scenario: Verify Main pool asset with WDV b/fwd amount by using save
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfSaveButton
     
    
     
     Scenario: Verify Main pool asset with WDV b/fwd amount by using cancel changes
     Given Click on Tax Return and Verify Tax Return 
     And Search a client and verify 
     And Select particular client 
     And Select CT600 Return 
     And Click on Capital Allowances calculator screen
     And Click on Add new asset
     And Enter Assert Description
     And Select asset category 
     And Select Main pool Asset
     And Select Asset acquisition date 
     And Enter WDV b/fwd amount 
     And Click on MainPoolOfCancelchanges
     
       Scenario: Verify kebab icon for capital allowance
     Given Click on Tax Return and Verify Tax Return
     And Search a client and verify
     And Select particular client
     And Select CT600 Return
     And Click on Capital Allowances calculator screen
     And Click on kebeb icon
     And Click on asset wise Details
     And Click on Pool wise Details
     