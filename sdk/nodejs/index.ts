// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { GetAccountResult } from "./getAccount";
export const getAccount: typeof import("./getAccount").getAccount = null as any;
export const getAccountOutput: typeof import("./getAccount").getAccountOutput = null as any;
utilities.lazyLoad(exports, ["getAccount","getAccountOutput"], () => require("./getAccount"));

export { GetCallerIdentityResult } from "./getCallerIdentity";
export const getCallerIdentity: typeof import("./getCallerIdentity").getCallerIdentity = null as any;
export const getCallerIdentityOutput: typeof import("./getCallerIdentity").getCallerIdentityOutput = null as any;
utilities.lazyLoad(exports, ["getCallerIdentity","getCallerIdentityOutput"], () => require("./getCallerIdentity"));

export { GetFileCrc64ChecksumArgs, GetFileCrc64ChecksumResult, GetFileCrc64ChecksumOutputArgs } from "./getFileCrc64Checksum";
export const getFileCrc64Checksum: typeof import("./getFileCrc64Checksum").getFileCrc64Checksum = null as any;
export const getFileCrc64ChecksumOutput: typeof import("./getFileCrc64Checksum").getFileCrc64ChecksumOutput = null as any;
utilities.lazyLoad(exports, ["getFileCrc64Checksum","getFileCrc64ChecksumOutput"], () => require("./getFileCrc64Checksum"));

export { GetMscSubContactVerificationMessageArgs, GetMscSubContactVerificationMessageResult, GetMscSubContactVerificationMessageOutputArgs } from "./getMscSubContactVerificationMessage";
export const getMscSubContactVerificationMessage: typeof import("./getMscSubContactVerificationMessage").getMscSubContactVerificationMessage = null as any;
export const getMscSubContactVerificationMessageOutput: typeof import("./getMscSubContactVerificationMessage").getMscSubContactVerificationMessageOutput = null as any;
utilities.lazyLoad(exports, ["getMscSubContactVerificationMessage","getMscSubContactVerificationMessageOutput"], () => require("./getMscSubContactVerificationMessage"));

export { GetMscSubContactsArgs, GetMscSubContactsResult, GetMscSubContactsOutputArgs } from "./getMscSubContacts";
export const getMscSubContacts: typeof import("./getMscSubContacts").getMscSubContacts = null as any;
export const getMscSubContactsOutput: typeof import("./getMscSubContacts").getMscSubContactsOutput = null as any;
utilities.lazyLoad(exports, ["getMscSubContacts","getMscSubContactsOutput"], () => require("./getMscSubContacts"));

export { GetMscSubSubscriptionsArgs, GetMscSubSubscriptionsResult, GetMscSubSubscriptionsOutputArgs } from "./getMscSubSubscriptions";
export const getMscSubSubscriptions: typeof import("./getMscSubSubscriptions").getMscSubSubscriptions = null as any;
export const getMscSubSubscriptionsOutput: typeof import("./getMscSubSubscriptions").getMscSubSubscriptionsOutput = null as any;
utilities.lazyLoad(exports, ["getMscSubSubscriptions","getMscSubSubscriptionsOutput"], () => require("./getMscSubSubscriptions"));

export { GetMscSubWebhooksArgs, GetMscSubWebhooksResult, GetMscSubWebhooksOutputArgs } from "./getMscSubWebhooks";
export const getMscSubWebhooks: typeof import("./getMscSubWebhooks").getMscSubWebhooks = null as any;
export const getMscSubWebhooksOutput: typeof import("./getMscSubWebhooks").getMscSubWebhooksOutput = null as any;
utilities.lazyLoad(exports, ["getMscSubWebhooks","getMscSubWebhooksOutput"], () => require("./getMscSubWebhooks"));

export { GetRegionsArgs, GetRegionsResult, GetRegionsOutputArgs } from "./getRegions";
export const getRegions: typeof import("./getRegions").getRegions = null as any;
export const getRegionsOutput: typeof import("./getRegions").getRegionsOutput = null as any;
utilities.lazyLoad(exports, ["getRegions","getRegionsOutput"], () => require("./getRegions"));

export { GetZonesArgs, GetZonesResult, GetZonesOutputArgs } from "./getZones";
export const getZones: typeof import("./getZones").getZones = null as any;
export const getZonesOutput: typeof import("./getZones").getZonesOutput = null as any;
utilities.lazyLoad(exports, ["getZones","getZonesOutput"], () => require("./getZones"));

export { MscSubContractArgs, MscSubContractState } from "./mscSubContract";
export type MscSubContract = import("./mscSubContract").MscSubContract;
export const MscSubContract: typeof import("./mscSubContract").MscSubContract = null as any;
utilities.lazyLoad(exports, ["MscSubContract"], () => require("./mscSubContract"));

export { MscSubSubscriptionArgs, MscSubSubscriptionState } from "./mscSubSubscription";
export type MscSubSubscription = import("./mscSubSubscription").MscSubSubscription;
export const MscSubSubscription: typeof import("./mscSubSubscription").MscSubSubscription = null as any;
utilities.lazyLoad(exports, ["MscSubSubscription"], () => require("./mscSubSubscription"));

export { MscSubWebhookArgs, MscSubWebhookState } from "./mscSubWebhook";
export type MscSubWebhook = import("./mscSubWebhook").MscSubWebhook;
export const MscSubWebhook: typeof import("./mscSubWebhook").MscSubWebhook = null as any;
utilities.lazyLoad(exports, ["MscSubWebhook"], () => require("./mscSubWebhook"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));


// Export sub-modules:
import * as ackone from "./ackone";
import * as actiontrail from "./actiontrail";
import * as adb from "./adb";
import * as alb from "./alb";
import * as alikafka from "./alikafka";
import * as amqp from "./amqp";
import * as apigateway from "./apigateway";
import * as arms from "./arms";
import * as bastionhost from "./bastionhost";
import * as bp from "./bp";
import * as brain from "./brain";
import * as bss from "./bss";
import * as cas from "./cas";
import * as cassandra from "./cassandra";
import * as cddc from "./cddc";
import * as cdn from "./cdn";
import * as cen from "./cen";
import * as cfg from "./cfg";
import * as chatbot from "./chatbot";
import * as clickhouse from "./clickhouse";
import * as cloudauth from "./cloudauth";
import * as cloudconnect from "./cloudconnect";
import * as cloudfirewall from "./cloudfirewall";
import * as cloudmonitor from "./cloudmonitor";
import * as cloudsso from "./cloudsso";
import * as cloudstoragegateway from "./cloudstoragegateway";
import * as cms from "./cms";
import * as compute from "./compute";
import * as config from "./config";
import * as cr from "./cr";
import * as cs from "./cs";
import * as das from "./das";
import * as databasefilesystem from "./databasefilesystem";
import * as databasegateway from "./databasegateway";
import * as datahub from "./datahub";
import * as dataworks from "./dataworks";
import * as dbs from "./dbs";
import * as dcdn from "./dcdn";
import * as ddos from "./ddos";
import * as dds from "./dds";
import * as dfs from "./dfs";
import * as directmail from "./directmail";
import * as dms from "./dms";
import * as dns from "./dns";
import * as drds from "./drds";
import * as dts from "./dts";
import * as eais from "./eais";
import * as ebs from "./ebs";
import * as eci from "./eci";
import * as ecp from "./ecp";
import * as ecs from "./ecs";
import * as edas from "./edas";
import * as eds from "./eds";
import * as eflo from "./eflo";
import * as ehpc from "./ehpc";
import * as eipanycast from "./eipanycast";
import * as elasticsearch from "./elasticsearch";
import * as emr from "./emr";
import * as emrv2 from "./emrv2";
import * as ens from "./ens";
import * as ess from "./ess";
import * as eventbridge from "./eventbridge";
import * as expressconnect from "./expressconnect";
import * as fc from "./fc";
import * as fnf from "./fnf";
import * as ga from "./ga";
import * as gpdb from "./gpdb";
import * as graphdatabase from "./graphdatabase";
import * as hbase from "./hbase";
import * as hbr from "./hbr";
import * as hologram from "./hologram";
import * as imm from "./imm";
import * as imp from "./imp";
import * as ims from "./ims";
import * as iot from "./iot";
import * as kms from "./kms";
import * as kvstore from "./kvstore";
import * as lindorm from "./lindorm";
import * as log from "./log";
import * as marketplace from "./marketplace";
import * as maxcompute from "./maxcompute";
import * as message from "./message";
import * as mhub from "./mhub";
import * as mns from "./mns";
import * as mongodb from "./mongodb";
import * as mse from "./mse";
import * as nas from "./nas";
import * as nlb from "./nlb";
import * as ocean from "./ocean";
import * as oos from "./oos";
import * as opensearch from "./opensearch";
import * as oss from "./oss";
import * as ots from "./ots";
import * as polardb from "./polardb";
import * as privatelink from "./privatelink";
import * as pvtz from "./pvtz";
import * as quickbi from "./quickbi";
import * as quotas from "./quotas";
import * as ram from "./ram";
import * as rdc from "./rdc";
import * as rds from "./rds";
import * as redis from "./redis";
import * as resourcemanager from "./resourcemanager";
import * as rocketmq from "./rocketmq";
import * as ros from "./ros";
import * as sae from "./sae";
import * as sag from "./sag";
import * as scdn from "./scdn";
import * as schedulerx from "./schedulerx";
import * as sddp from "./sddp";
import * as securitycenter from "./securitycenter";
import * as servicecatalog from "./servicecatalog";
import * as servicemesh from "./servicemesh";
import * as simpleapplicationserver from "./simpleapplicationserver";
import * as slb from "./slb";
import * as sms from "./sms";
import * as tag from "./tag";
import * as threatdetection from "./threatdetection";
import * as tsdb from "./tsdb";
import * as types from "./types";
import * as videosurveillance from "./videosurveillance";
import * as vod from "./vod";
import * as vpc from "./vpc";
import * as vpn from "./vpn";
import * as waf from "./waf";
import * as wafv3 from "./wafv3";
import * as yundun from "./yundun";

export {
    ackone,
    actiontrail,
    adb,
    alb,
    alikafka,
    amqp,
    apigateway,
    arms,
    bastionhost,
    bp,
    brain,
    bss,
    cas,
    cassandra,
    cddc,
    cdn,
    cen,
    cfg,
    chatbot,
    clickhouse,
    cloudauth,
    cloudconnect,
    cloudfirewall,
    cloudmonitor,
    cloudsso,
    cloudstoragegateway,
    cms,
    compute,
    config,
    cr,
    cs,
    das,
    databasefilesystem,
    databasegateway,
    datahub,
    dataworks,
    dbs,
    dcdn,
    ddos,
    dds,
    dfs,
    directmail,
    dms,
    dns,
    drds,
    dts,
    eais,
    ebs,
    eci,
    ecp,
    ecs,
    edas,
    eds,
    eflo,
    ehpc,
    eipanycast,
    elasticsearch,
    emr,
    emrv2,
    ens,
    ess,
    eventbridge,
    expressconnect,
    fc,
    fnf,
    ga,
    gpdb,
    graphdatabase,
    hbase,
    hbr,
    hologram,
    imm,
    imp,
    ims,
    iot,
    kms,
    kvstore,
    lindorm,
    log,
    marketplace,
    maxcompute,
    message,
    mhub,
    mns,
    mongodb,
    mse,
    nas,
    nlb,
    ocean,
    oos,
    opensearch,
    oss,
    ots,
    polardb,
    privatelink,
    pvtz,
    quickbi,
    quotas,
    ram,
    rdc,
    rds,
    redis,
    resourcemanager,
    rocketmq,
    ros,
    sae,
    sag,
    scdn,
    schedulerx,
    sddp,
    securitycenter,
    servicecatalog,
    servicemesh,
    simpleapplicationserver,
    slb,
    sms,
    tag,
    threatdetection,
    tsdb,
    types,
    videosurveillance,
    vod,
    vpc,
    vpn,
    waf,
    wafv3,
    yundun,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:index/mscSubContract:MscSubContract":
                return new MscSubContract(name, <any>undefined, { urn })
            case "alicloud:index/mscSubSubscription:MscSubSubscription":
                return new MscSubSubscription(name, <any>undefined, { urn })
            case "alicloud:index/mscSubWebhook:MscSubWebhook":
                return new MscSubWebhook(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "index/mscSubContract", _module)
pulumi.runtime.registerResourceModule("alicloud", "index/mscSubSubscription", _module)
pulumi.runtime.registerResourceModule("alicloud", "index/mscSubWebhook", _module)
pulumi.runtime.registerResourcePackage("alicloud", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:alicloud") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
