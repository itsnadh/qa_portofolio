/// <reference types="cypress"/>

it('Rute Privy Quarter ke PrivyID Jakarta',()=>{
    cy.visit('https://maps.google.com')
    cy.viewport(1280,720)
    cy.get('#hArJGc').click()
    cy.get('#sb_ifc51 > .tactile-searchbox-input').type('Privy Quarter') 
    cy.get('#sb_ifc52 > .tactile-searchbox-input').type('PrivyID {enter}') 
    cy.get('#section-directions-trip-0 > .MespJc').click() 
    cy.get('.yra0jd').click()
})


