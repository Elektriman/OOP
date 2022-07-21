# -*- coding: utf-8 -*-
"""
Created on Tue May  4 11:16:21 2021

@author: Julien
"""

class Composant :
    
    def __init__(self, ID, prix):
        self.ID = ID
        self.prix = prix

class HDD (Composant) :
    
    def __init__(self, ID, prix, conso, capacite):
        super(ID, prix)
        self.conso = conso
        self.capacite = capacite
    
    def donneEnergie(self):
        return self.conso

class alim (Composant) :
    
    def __init__(self, ID, prix, puissance):
        super(ID, prix)
        self.puissance = puissance
    
    
    def donneEnergie(self):
        return self.puissance

class CPU (Composant) :
    
    def __init__(self, ID, prix, conso, freq, socket):
        super(ID, prix)
        self.conso = conso
        self.freq = freq
        self.socket = socket
    
    def donneEnergie(self):
        return self.conso

class RAM (Composant) :
    
    def __init__(self, ID, prix, freq, conso):
        super(ID, prix)
        self.freq = freq
        self.conso = conso
    
    def donneEnergie(self):
        return self.conso

class PC :
    
    def __init__(self, *composants):
        bilan_energ = 0
        for comp in composants :
            bilan_energ += comp.donneEnergie()
        
        try :
            if bilan_energ < 0 :
                raise ValueError("l'alimentation n'est pas assez puissante")
            else :
                self.struct = []
        
        except ValueError as e :
            raise e