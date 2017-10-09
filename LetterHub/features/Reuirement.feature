#Author: manjusha.gera@dharani.co.in
@tag
Feature: Test LetterHub application
  I want to use this template for my feature file

  @CreateAccount
  Scenario: Create account
    Given valid URL in the mentioned browser
    And Enter mandatory fields"manjusha", "manjusha.gera+automation@dharani.co.in", "1234567"click on create account
    When clickHere link is displayed click on the link & try to login with credentials
      | test@dharani.co.in                     |  123456 |
      | manjusha.gera+automation@dharani.co.in | 1234567 |
    And Application should display how it works page

  # @ForotPassword
  # Scenario: Test Forgot password
  # When user clicks on forgot password application should ask user to enter email
  # And application should send a password through mail.
  @Contacts
  Scenario: Create Contact
    When Add new account is clicked application should display a pop up screen
    And User should be able to enter all the fields
      | manjusha | Gera | Dharani info technologies |
    And search "manjusha gera" & try to update the contact
      | QA | Ok Reddy building | Guntur | Andhra | 522007 |
    #| QA | Opp KFC restaurant | Guntur | Andhra | 522024 |
    # | QA2 | Opp KFC restaurant | Guntur2 | Andhra | 522024 |
    And User should be able to create a new tag "gmail"

  @mailings
  Scenario: Test mailer functionality
    #When User clicks on Mailings menu bar application should display mailing screen
    And User clicks on start new mailer to send jobs, application should navigate to select receipients
    And User should be able to selct receipients by verifying the tags & search contacts
    Then application should be able to navigate to select document if he choose contact"manjusha gera" via select all check box or individual contact
    And should throw error if he doesnot select any of contact
    #selectdocument(uploadfile)
    When User Picks to select document via upload file"C:\\Users\\manjusha.gera\\Desktop\\OPRASample2.pdf"
    #common
    Then User should be able to preview the file
    And he can able to select address from addressbook or by default address
    And application should navigate to review & confirm page if he picks any address
    And should throw error if he does not select any address
    Then User should be able to rename the job in shown format "Test-Notice-Sep-22-2017"
    And should be able to select page size, carrier & print options
    Then User should be able to pay via credit If he has balance else Buycredit should be done to submit job.
    #selectDocument(Create letterOnline)
    When User wants to select document via create letter online
    Then application should navigate to Edit template
    And User should be able to select custom field as per his wish & should be able to copy custom field.
    When User clicks on save & preview application should display pop up to save/dont save template"Test AutoTemplate"
    #common
    #SelectDocument(existing template)
    When User wants to select existing template
    Then application should be able to display edit template screen.

  @BuyCredit
  Scenario: Check whether the purchasing credits is working or not
    When user clicked on the buy credit menu
    Then application must navigate to the buy credit page
    When user selected the corresponding plan and clicked on the buy credit
      | Manjusha | Gera | 4111111111111111 | 02/25 | 123 |
    Then application must purchase the credits successfully
