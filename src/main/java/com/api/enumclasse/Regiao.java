package com.api.enumclasse;

public class Regiao {
    final static UF[] NORTE = {UF.AC, UF.AP, UF.AM, UF.PA, UF.RO, UF.RR, UF.TO};
    final static UF[] NORDESTE = {UF.AL, UF.BA, UF.CE, UF.MA, UF.PB, UF.PE, UF.PI, UF.RN, UF.SE};
    final static UF[] CENTRO_OESTE = {UF.DF, UF.GO, UF.MT, UF.MS};
    final static UF[] SUDESTE = {UF.ES, UF.MG, UF.RJ, UF.SP};
    final static UF[] SUL = {UF.PR, UF.RS, UF.SC};

    final static UF[][] Regioes = {NORTE, NORDESTE, CENTRO_OESTE, SUDESTE, SUL};
}
