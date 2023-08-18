package com.nppgks.testopctagstorage;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class TagStorage {

    public Map<String, String> tagData = new HashMap<>();

    TagStorage(){
        String Q_ij = """
                [
                87.5,65.7,43.9,21.9,11.1,
                87.5,64.4,43.7,21.9,11.1,
                87.5,65.7,43.7,21.9,11.1,
                87.5,65.5,43.7,21.9,11.1,
                87.6,65.5,43.7,21.9,11.1
                ]
                """;
        tagData.put("WinCC_OA.mi3622.Q_ij", Q_ij.replaceAll("\n",""));

        String N_e_ij = """
                [
                33002,33007,30262,20626,10501,
                33013,32999,30262,20623,10501,
                33013,33007,30261,20626,10499,
                33012,33007,30256,20625,10500,
                33012,33007,30262,20623,10500
                ]
                """;
        tagData.put("WinCC_OA.mi3622.N_e_ij", N_e_ij.replaceAll("\n",""));

        String N_p_ij = """
                [
                33002,33007,30262,20626,10501,
                33012,32998,30262,20623,10501,
                33012,33007,30261,20626,10499,
                33013,33007,30257,20625,10501,
                33013,33007,30261,20624,10500
                ]
                """;
        tagData.put("WinCC_OA.mi3622.N_p_ij", N_p_ij.replaceAll("\n",""));

        String T_ij = """
                [
                5.7,6.9,10,14.4,14.1,
                5.3,7.3,10.3,14.3,14.3,
                5.3,7.3,10.3,14.3,14.2,
                5.3,7.2,10.3,14.2,14.3,
                5.3,7.3,10.3,14.3,14.3
                ]
                """;
        tagData.put("WinCC_OA.mi3622.T_ij", T_ij.replaceAll("\n",""));

        String M_ij = """
                [
                145.756,145.778,133.654,91.0918,46.3784,
                145.8,145.738,133.654,91.0829,46.3784,
                145.8,145.778,133.65,91.0962,46.3696,
                145.8040,145.778,133.632,91.0918,46.3784,
                145.8040,145.778,133.65,91.0974,46.3740
                ]
                """;
        tagData.put("WinCC_OA.mi3622.M_ij", M_ij.replaceAll("\n",""));

        tagData.put("WinCC_OA.mi3622.Q_e_arr", "[21,65,87.5,272.6]");

        tagData.put("WinCC_OA.mi3622.K_e_arr", "[226.4151,226.4151,226.4151,226.4151]");

        tagData.put("WinCC_OA.mi3622.f_p_max", "10000");

        tagData.put("WinCC_OA.mi3622.Q_p_max", "159");

        tagData.put("WinCC_OA.mi3622.MF_p", "1");
        tagData.put("WinCC_OA.mi3622.Q_p", "[0,68,136,204,272]");

        tagData.put("WinCC_OA.mi3622.theta_e", "0.11");

        tagData.put("WinCC_OA.mi3622.theta_N", "0.02");
        tagData.put("WinCC_OA.mi3622.theta_p", "");
        tagData.put("WinCC_OA.mi3622.theta_t", "");

        tagData.put("WinCC_OA.mi3622.ZS", "0.041");

        tagData.put("WinCC_OA.mi3622.f_p", "[0,2500,5000,7500,10000]");
        tagData.put("WinCC_OA.mi3622.K_y", "[226.4151,226.4151,226.4151,226.4151,226.4151]");

        tagData.put("WinCC_OA.mi3622.measureCount", "5");
        tagData.put("WinCC_OA.mi3622.pointsCount", "5");

        tagData.put("WinCC_OA.mi3622.check_inspection", "Осмотрели");
        tagData.put("WinCC_OA.mi3622.check_leakproofness", "Герметично");
        tagData.put("WinCC_OA.mi3622.check_software", "Соответствует");
        tagData.put("WinCC_OA.mi3622.check_testing", "Опробовали");
        tagData.put("WinCC_OA.mi3622.CPM_name", "Micro Motion");
        tagData.put("WinCC_OA.mi3622.CPM_number", "89807767864629");
        tagData.put("WinCC_OA.mi3622.CPM_owner", "Ямал СПГ");
        tagData.put("WinCC_OA.mi3622.poverka_place", "УКУ ДТ, ИЛ-2");
        tagData.put("WinCC_OA.mi3622.poverka_method", "МИ 3622-2020");
        tagData.put("WinCC_OA.mi3622.inspector_full_name", "Мишурин М.Г.");
        tagData.put("WinCC_OA.mi3622.inspector_position", "Инженер метрологии");
        tagData.put("WinCC_OA.mi3622.PR_name", "Micro Motion");
        tagData.put("WinCC_OA.mi3622.PR_number", "0947873986");

        tagData.put("WinCC_OA.mi3622.MFOrK", "MF");
        tagData.put("WinCC_OA.mi3622.zeroStabilityCorr", "true");
        tagData.put("WinCC_OA.mi3622.operatingOrControlCPM", "контрольный");
        tagData.put("WinCC_OA.mi3622.rangeType", "рабочий диапазон");
        tagData.put("WinCC_OA.mi3622.protocolNumber", "230");

        tagData.put("ns=0;i=50240", null);
        tagData.put("ns=0;i=50251", null);
        tagData.put("ns=0;i=50242", null);


        // Шапка акта приема-сдачи
        tagData.put("WinCC_OA.accAct.acceptanceActNumber", "44.2023");
        tagData.put("WinCC_OA.accAct.acceptanceActDate", "13.02.2023");
        tagData.put("WinCC_OA.accAct.oilAcceptancePoint", "МУПН Ен-Яхтинское м/р");
        tagData.put("WinCC_OA.accAct.pointOwner", "ООО \"Газпронефть-Заполярье\"");
        tagData.put("WinCC_OA.accAct.SIKN", "№1524");
        tagData.put("WinCC_OA.accAct.deliverOrg", "");
        tagData.put("WinCC_OA.accAct.deliverNameTitle", "Лазарев М.А.");
        tagData.put("WinCC_OA.accAct.deliverProxyDate", "24.02.2022г");
        tagData.put("WinCC_OA.accAct.deliverProxyNumber", "Д-33");
        tagData.put("WinCC_OA.accAct.receiverOrg", "");
        tagData.put("WinCC_OA.accAct.receiverNameTitle", "");
        tagData.put("WinCC_OA.accAct.receiverProxyDate", "");
        tagData.put("WinCC_OA.accAct.receiverProxyNumber", "");

        // показатели акта приема-сдачи
        tagData.put("WinCC_OA.accAct.prevEndVol_shift1", "348025");
        tagData.put("WinCC_OA.accAct.prevEndVol_shift2", "348737");
        tagData.put("WinCC_OA.accAct.grossOilMass_shift1", "574");
        tagData.put("WinCC_OA.accAct.grossOilMass_shift2", "575");

        // нижняя часть акта
        tagData.put("WinCC_OA.accAct.oilNetMassInWords", "одна тысяча сто сорок восемь т.");
        tagData.put("WinCC_OA.accAct.GOST", "1.0.1.1");

        putMi3272InitialTags(tagData);
        putKmhViscometerInitialTags(tagData);
    }

    public void putKmhViscometerInitialTags(Map<String, String> tagData){
        tagData.put("kmhVisc.protocolNumber", "018-19");
        tagData.put("kmhVisc.siknNumber", "1516");
        tagData.put("kmhVisc.place_name", "ПСП Марковское ООО «ИНК»");
        tagData.put("kmhVisc.transmitter_type", "Solartron 7829");
        tagData.put("kmhVisc.viscometer_type", "ВНЖ");
        tagData.put("kmhVisc.transmitter_number", "14462515");
        tagData.put("kmhVisc.viscometer_number", "32");
        tagData.put("kmhVisc.transmitter_date", "12.02.2018");
        tagData.put("kmhVisc.viscometer_date", "25.03.2015");
        tagData.put("kmhVisc.delta_v_PVz", "0.2");
        tagData.put("kmhVisc.delta_v_il", "0.7");
        tagData.put("kmhVisc.t_bik", "[15.0, 15.0, 15.0]");
        tagData.put("kmhVisc.ro_bik", "[824.7, 824.7, 824.7]");
        tagData.put("kmhVisc.eta_PVz", "[6.08, 6.08, 6.08]");
        tagData.put("kmhVisc.v_PVz", "[7.36, 7.36, 7.363]");
        tagData.put("kmhVisc.v_il", "[7.34, 7.37, 7.306]");
        tagData.put("kmhVisc.v_PVz_minus_v_il", "[0.02, 0.01, 0.057]");
        tagData.put("kmhVisc.conclusion", "годен");
        tagData.put("kmhVisc.kmh_date", "06.02.2019");
        tagData.put("kmhVisc.deliverOrg", "ООО \"ИНК\"");
        tagData.put("kmhVisc.metrologistName", "Титов А.В.");
        tagData.put("kmhVisc.chemistName", "Рабинович Ю.Д.");
        tagData.put("kmhVisc.receiverOrg", "ООО \"Транснефть-Восток\"");
        tagData.put("kmhVisc.receiverPosition", "Мастер ПСП НПС-7");
        tagData.put("kmhVisc.receiverName", "Ермолаев К.В.");
        tagData.put("kmhVisc.serviceOrg", "ЗАО НИЦ \"Инкомсистем\"");
        tagData.put("kmhVisc.servicePosition", "Инженер ТО и С");
        tagData.put("kmhVisc.serviceName", "Рахматуллин Р.Ф.");
        tagData.put("kmhVisc.printSaveButtonsRequired", "true");
    }

    public void putMi3272InitialTags(Map<String, String> tagData){
        tagData.put("mi3272.measureCount", "10");
        tagData.put("mi3272.seriesCount", "5");
        tagData.put("mi3272.pointsCount", "5");
        tagData.put("mi3272.usedTPR", "true");
        tagData.put("mi3272.TPRInKP", "true");
        tagData.put("mi3272.calibrCharImpl", "СОИ поддиапазон");

        String Q_ij_TPR= """
                [[224.538601,224.508210,224.457687,224.467196,224.490221],
                [334.186523,334.066921,334.128994,333.924329,334.194831],
                [432.127354,432.283865,432.085278,432.110721,432.024323],
                [533.915724,534.020652,533.753315,533.517730,527.517424],
                [635.644900,635.566815,635.344478,634.789685,635.023645]]
                """;

        String N_TPR_ij_avg = """
                [[46.123608,46.116013,46.124084,46.116341,46.118843],
                [46.117413,46.114552,46.116962,46.115993,46.115330],
                [46.120476,46.127182,46.123970,46.126762,46.126240],
                [46.130447,46.140736,46.140926,46.132839,46.138634],
                [46.149391,46.150482,46.151424,46.143139,46.153027]]
                """;

        String t_TPR_ij_avg = """
                [[13.208480,13.204630,13.203671,13.198812,13.197015],
                [13.186310,13.354690,13.531353,13.632994,13.658260],
                [13.093396,13.098581,13.106140,13.106156,13.109241],
                [13.244493,13.350440,13.502419,13.537302,13.563994],
                [13.749858,13.800687,13.818151,13.830619,13.837958]]
                """;

        String P_TPR_ij_avg = """
                [[1.437914,1.437763,1.438334,1.438301,1.438719],
                [1.268818,1.268860,1.269291,1.268851,1.269054],
                [1.637646,1.637226,1.637582,1.637785,1.638554],
                [2.459271,2.459309,2.459214,2.458488,2.488933],
                [2.328182,2.328280,2.328530,2.328470,2.329509]]
                """;

        String t_KP_ij_avg = """
                [[13.208480,13.204630,13.203671,13.198812,13.197015],
                [13.186310,13.354690,13.531353,13.632994,13.658260],
                [13.093396,13.098581,13.106140,13.106156,13.109241],
                [13.244493,13.350440,13.502419,13.537302,13.563994],
                [13.749858,13.800687,13.818151,13.830619,13.837958]]
                """;
        String P_KP_ij_avg = """
                [[1.437914,1.437763,1.438334,1.438301,1.438719],
                [1.268818,1.268860,1.269291,1.268851,1.269054],
                [1.637646,1.637226,1.637582,1.637785,1.638554],
                [2.459271,2.459309,2.459214,2.458488,2.488933],
                [2.328182,2.328280,2.328530,2.328470,2.329509]]
                """;
        String t_st_ij = """
                [[14.796730,14.796730,14.796730,14.796730,14.796730],
                [15.239799,15.239799,15.239799,15.239799,15.239799],
                [14.344620,14.344620,14.344620,14.344620,14.344620],
                [14.181854,14.181854,14.181854,14.181854,14.181854],
                [13.991970,13.991970,13.991970,13.991970,13.991970]]
                """;

        String ro_PP_ij = """
                [[821.176941,821.209229,821.206665,821.230530,821.166626,821.204956,821.234009,821.219604,821.223145,821.203369],
                [820.770813,820.731018,820.730652,820.759277,820.740967,820.714233,820.720825,820.747864,820.746460,820.747986],
                [821.386963,821.378601,821.384521,821.381714,821.370239,821.371948,821.366211,821.376404,821.383850,821.362610],
                [821.613708,821.623169,821.631958,821.616089,821.622253,821.634338,821.607483,821.623108,821.600891,821.622070],
                [821.235413,821.241638,821.228149,821.220398,821.230652,821.220154,821.215576,821.233276,821.211060,821.184509]]
                """;

        String ro_BIK_ij = """
                [[821.18,821.21,821.21,821.23,821.17,821.20,821.23,821.22,821.22,821.20],
                [820.77,820.73,820.73,820.76,820.74,820.71,820.72,820.75,820.75,820.75],
                [821.39,821.38,821.38,821.38,821.37,821.37,821.37,821.38,821.38,821.36],
                [821.61,821.62,821.63,821.62,821.62,821.63,821.61,821.62,821.60,821.62],
                [821.24,821.24,821.23,821.22,821.23,821.22,821.22,821.23,821.21,821.18]]
                """;
        String t_PP_ij = """
                [[13.875558,13.872135,13.896128,13.851083,13.838077,13.819386,13.855014,13.880439,13.873559,13.888057],
                [14.353182,14.379037,14.387490,14.390039,14.399739,14.399597,14.402250,14.402908,14.406906,14.403070],
                [13.724781,13.725098,13.722240,13.726476,13.727546,13.732760,13.737770,13.729637,13.728325,13.725777],
                [14.171124,14.184172,14.187254,14.190256,14.190944,14.188753,14.199639,14.197853,14.200177,14.205354],
                [14.450851,14.455412,14.469972,14.477814,14.486410,14.488550,14.494868,14.496292,14.497575,14.499304]]
                 """;
        String P_PP_ij = """
                [[1.556652,1.557405,1.576316,1.578859,1.582344,1.584277,1.586485,1.587354,1.588351,1.588671],
                [1.430445,1.431037,1.432967,1.431682,1.431177,1.431570,1.432312,1.432190,1.431691,1.431941],
                [1.830999,1.830945,1.832921,1.831202,1.832791,1.832749,1.832466,1.834462,1.832709,1.833933],
                [2.715914,2.717683,2.718018,2.716509,2.720436,2.716718,2.717285,2.715832,2.717186,2.717981],
                [2.611435,2.608938,2.613119,2.610436,2.611578,2.610447,2.612868,2.614232,2.613120,2.611389]]
                """;
        String N2_TPR_ij_avg = """
                [[46.1167336,46.1126823,46.1181755,46.1213150,46.1182060],
                [46.1134834,46.1168785,46.1151123,46.1121979,46.1157532],
                [46.1244392,46.1241302,46.1250572,46.1290321,46.1266518],
                [46.1400223,46.1455421,46.1402702,46.1352005,46.1396980],
                [46.1444664,46.1492043,46.1486931,46.1425591,46.1471558]]
                """;
        String t2_KP_ij_avg = """
                [[13.202856,13.207086,13.204559,13.206666,13.211983],
                [13.724061,13.724603,13.724388,13.719501,13.713487],
                [13.112625,13.117012,13.116467,13.114717,13.115682],
                [13.611967,13.624336,13.625702,13.633361,13.637091],
                [13.969650,13.976052,13.978701,13.984058,13.987157]]
                """;
        String P2_KP_ij_avg = """
                [[1.439158,1.439315,1.439770,1.440310,1.440128],
                [1.271320,1.271799,1.271512,1.271130,1.270508],
                [1.639046,1.639463,1.639139,1.638977,1.637373],
                [2.479665,2.478713,2.479470,2.479671,2.480458],
                [2.378929,2.378372,2.378733,2.378848,2.379729]]
                """;
        String t2_st_ij = """
                [[15.104164,15.104164,15.104164,15.104164,15.104164],
                [15.375435,15.375435,15.375435,15.375435,15.375435],
                [14.227066,14.227066,14.227066,14.227066,14.227066],
                [14.091438,14.091438,14.091438,14.091438,14.091438],
                [13.747829,13.747829,13.747829,13.747829,13.747829]]
                """;
        String Q_ij = """
                [[228.410416,227.159958,226.100906,225.697845,225.362869,225.179672,225.048309,224.977692,224.934280,224.898605],
                [332.639801,332.666534,332.653748,332.653748,332.656799,332.643402,332.631561,332.609039,332.573547,332.518646],
                [430.062317,430.015839,430.035126,430.000946,429.946899,429.846619,429.799866,429.727783,429.695801,429.577271],
                [523.972168,523.933899,523.920105,523.730164,523.786682,523.724548,523.898193,523.804565,523.694031,527.159363],
                [633.228271,632.652954,632.590637,632.502502,632.599976,632.400391,632.283447,632.204895,632.197815,631.943359]]
                """;
        String N_mas_ij = """
                [[1179666,1180144,1181765,1179950,1179109,1179351,1178663,1179529,1178938,1178860],
                [1180095,1179330,1177888,1180360,1180693,1179947,1179744,1178481,1180075,1180901],
                [1182529,1181498,1179606,1180415,1180545,1181103,1182780,1182165,1182007,1181820],
                [1180653,1181751,1182398,1179515,1181165,1183055,1180062,1178921,1179772,1179492],
                [1177599,1178164,1179274,1179927,1178474,1179430,1178395,1180495,1176908,1177557]]
                """;
        String N_TPR_ij_zad = """
                [[10010,10015,10027,10013,10006,10007,10001,10009,10004,10003],
                [10018,10012,10001,10022,10024,10018,10016,10004,10019,10026],
                [10034,10024,10009,10015,10016,10021,10036,10030,10029,10027],
                [10013,10022,10027,10005,10017,10035,10008,10000,10007,10004],
                [10011,10021,10028,10033,10018,10031,10022,10040,10008,10018]]
                """;
        String t_TPR_ij = """
                [[13.202753,13.205186,13.203438,13.174415,13.152116,13.164060,13.196576,13.201877,13.192824,13.209053],
                [13.698619,13.713170,13.717439,13.720113,13.720798,13.720632,13.719229,13.720370,13.719939,13.721328],
                [13.109147,13.114634,13.117617,13.118594,13.118944,13.121017,13.119851,13.119506,13.120603,13.120060],
                [13.585393,13.592384,13.591421,13.600593,13.598331,13.601276,13.603536,13.610104,13.609296,13.608183],
                [13.912652,13.919135,13.929363,13.938115,13.942874,13.950116,13.951431,13.952025,13.955858,13.959055]]
                """;
        String P_TPR_ij = """
                [[1.398866,1.411907,1.424124,1.428399,1.432116,1.434470,1.436117,1.437057,1.437517,1.438183],
                [1.272041,1.272327,1.272116,1.272278,1.271900,1.272088,1.272119,1.272192,1.272321,1.273052],
                [1.638925,1.639054,1.639163,1.639190,1.639169,1.639621,1.639737,1.639877,1.639943,1.640183],
                [2.501287,2.501369,2.501683,2.501813,2.501837,2.501807,2.500802,2.500986,2.501626,2.484964],
                [2.376389,2.377975,2.379580,2.380173,2.380347,2.379739,2.380782,2.381069,2.381713,2.381716]]
                """;

        tagData.put("mi3272.Q_ij_TPR", Q_ij_TPR.replaceAll("\n",""));
        tagData.put("mi3272.N_TPR_ij_avg", N_TPR_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.t_TPR_ij_avg", t_TPR_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.P_TPR_ij_avg", P_TPR_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.t_KP_ij_avg", t_KP_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.P_KP_ij_avg", P_KP_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.t_st_ij", t_st_ij.replaceAll("\n",""));

        tagData.put("mi3272.operatingFluid", "нефть");
        tagData.put("mi3272.alpha_st_t", "0.00000144");
        tagData.put("mi3272.alpha_cyl_t_sq", "0.0000216");
        tagData.put("mi3272.V_KP_0", "0.119454");

        tagData.put("mi3272.ro_PP_ij", ro_PP_ij.replaceAll("\n",""));
        tagData.put("mi3272.ro_BIK_ij", ro_BIK_ij.replaceAll("\n",""));
        tagData.put("mi3272.t_PP_ij", t_PP_ij.replaceAll("\n",""));
        tagData.put("mi3272.P_PP_ij", P_PP_ij.replaceAll("\n",""));
        tagData.put("mi3272.N2_TPR_ij_avg", N2_TPR_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.t2_KP_ij_avg", t2_KP_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.P2_KP_ij_avg", P2_KP_ij_avg.replaceAll("\n",""));
        tagData.put("mi3272.t2_st_ij", t2_st_ij.replaceAll("\n",""));
        tagData.put("mi3272.Q_ij", Q_ij.replaceAll("\n",""));
        tagData.put("mi3272.N_mas_ij", N_mas_ij.replaceAll("\n",""));
        tagData.put("mi3272.N_TPR_ij_zad", N_TPR_ij_zad.replaceAll("\n",""));
        tagData.put("mi3272.t_TPR_ij", t_TPR_ij.replaceAll("\n",""));
        tagData.put("mi3272.P_TPR_ij", P_TPR_ij.replaceAll("\n",""));

        tagData.put("mi3272.KF_conf", "65454.5");
        //tagData.put("mi3272.K_PEP_gr", "65454.5");
        tagData.put("mi3272.MF_set_range", "1");
        tagData.put("mi3272.delta_KP", "0.05");
        tagData.put("mi3272.delta_PP", "0.03");
        tagData.put("mi3272.delta_UOI_K", "0.001");
        tagData.put("mi3272.delta_t_KP", "0.2");
        tagData.put("mi3272.delta_t_PP", "0.2");
        tagData.put("mi3272.ZS", "0.0682");
        tagData.put("mi3272.D", "444.5");
        tagData.put("mi3272.E", "196500");
        tagData.put("mi3272.s", "31.75");

        tagData.put("mi3272.protocolNumber", "");
        tagData.put("mi3272.massmeterModel", "CMFHC2");
        tagData.put("mi3272.place_name", "ПСП \"Марковское\"");
        tagData.put("mi3272.place_owner", "ООО \"Иркутская нефтяная компания\"");
        tagData.put("mi3272.massmeterSensor", "CMFHC2");
        tagData.put("mi3272.massmeterDu", "200");
        tagData.put("mi3272.massmeterNumber", "12110976");
        tagData.put("mi3272.pepModel", "2700R");
        tagData.put("mi3272.pepNumber", "3847397");
        tagData.put("mi3272.installedOn", "СИКН");
        tagData.put("mi3272.ilNumber", "1 контр-рез");
        tagData.put("mi3272.cpType", "поверочная установка CP");
        tagData.put("mi3272.cpGrade", "первый");
        tagData.put("mi3272.cpNumber", "1505-10020479-1.1-1");
        tagData.put("mi3272.cpDate", "03.10.2015");
        tagData.put("mi3272.tprType", "HELIFLU TZN 200-800");
        tagData.put("mi3272.tprRange", "80-800");
        tagData.put("mi3272.tprNumber", "9022106");
        tagData.put("mi3272.ppType", "7835B");
        tagData.put("mi3272.ppNumber", "8000596");
        tagData.put("mi3272.ppDate", "09.10.2015");
        tagData.put("mi3272.companyName", "НПП ГКС");
        tagData.put("mi3272.verifierName", "В.В. Пупкин");
    }

    public void generateTags(){
        double min = 0;
        double max = 1000;

        tagData.put("2hour_mass_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("2hour_temp_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("2hour_pressure_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("daily_mass_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_temp_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_pressure_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("daily_density_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density20_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density15_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_moisture_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_increasing_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_vol_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_vol_increasing_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_temp_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_pressure_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density20_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density15_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_moisture_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_increasing_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("daily_vol_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_vol_increasing_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_temp_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_pressure_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density20_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density15_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_moisture_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_increasing_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_vol_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_vol_increasing_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_temp_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_pressure_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_density20_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("daily_density15_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_moisture_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_mass_gross_increasing_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_vol_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_vol_increasing_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("daily_power_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_power_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_power_il3", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_power_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("daily_power_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));


        // hour tags
        tagData.put("hour_mass_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_temp_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_pressure_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("hour_density_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density20_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density15_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_moisture_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_increasing_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_vol_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_vol_increasing_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_temp_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_pressure_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density20_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density15_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_moisture_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_increasing_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("hour_vol_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_vol_increasing_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_temp_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_pressure_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density20_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density15_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_moisture_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_increasing_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_vol_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_vol_increasing_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_temp_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_pressure_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_density20_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        tagData.put("hour_density15_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_moisture_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_mass_gross_increasing_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_vol_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("hour_vol_increasing_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));

        //shift tags
        
        tagData.put("shift_mass_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_temp_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_pressure_il1", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        
        tagData.put("shift_mass_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_temp_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_pressure_il2", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        
        tagData.put("shift_mass_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_temp_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_pressure_sikn", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        
        tagData.put("shift_mass_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_temp_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
        tagData.put("shift_pressure_bik", String.valueOf(ThreadLocalRandom.current().nextDouble(min, max)));
    }
    public boolean writeValues(Map<String, String> values){
        tagData.putAll(values);
        return true;
    }
}
