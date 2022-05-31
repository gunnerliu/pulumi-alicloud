# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'AssumeRole',
    'Endpoints',
]

@pulumi.output_type
class AssumeRole(dict):
    def __init__(__self__, *,
                 role_arn: str,
                 policy: Optional[str] = None,
                 session_expiration: Optional[int] = None,
                 session_name: Optional[str] = None):
        pulumi.set(__self__, "role_arn", role_arn)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if session_expiration is not None:
            pulumi.set(__self__, "session_expiration", session_expiration)
        if session_name is not None:
            pulumi.set(__self__, "session_name", session_name)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter
    def policy(self) -> Optional[str]:
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="sessionExpiration")
    def session_expiration(self) -> Optional[int]:
        return pulumi.get(self, "session_expiration")

    @property
    @pulumi.getter(name="sessionName")
    def session_name(self) -> Optional[str]:
        return pulumi.get(self, "session_name")


@pulumi.output_type
class Endpoints(dict):
    def __init__(__self__, *,
                 acr: Optional[str] = None,
                 actiontrail: Optional[str] = None,
                 adb: Optional[str] = None,
                 alb: Optional[str] = None,
                 alidfs: Optional[str] = None,
                 alidns: Optional[str] = None,
                 alikafka: Optional[str] = None,
                 apigateway: Optional[str] = None,
                 arms: Optional[str] = None,
                 bastionhost: Optional[str] = None,
                 brain_industrial: Optional[str] = None,
                 bssopenapi: Optional[str] = None,
                 cas: Optional[str] = None,
                 cassandra: Optional[str] = None,
                 cbn: Optional[str] = None,
                 cddc: Optional[str] = None,
                 cdn: Optional[str] = None,
                 cds: Optional[str] = None,
                 clickhouse: Optional[str] = None,
                 cloudauth: Optional[str] = None,
                 cloudphone: Optional[str] = None,
                 cloudsso: Optional[str] = None,
                 cms: Optional[str] = None,
                 config: Optional[str] = None,
                 cr: Optional[str] = None,
                 cs: Optional[str] = None,
                 datahub: Optional[str] = None,
                 dataworkspublic: Optional[str] = None,
                 dbfs: Optional[str] = None,
                 dcdn: Optional[str] = None,
                 ddosbasic: Optional[str] = None,
                 ddosbgp: Optional[str] = None,
                 ddoscoo: Optional[str] = None,
                 dds: Optional[str] = None,
                 devopsrdc: Optional[str] = None,
                 dg: Optional[str] = None,
                 dm: Optional[str] = None,
                 dms_enterprise: Optional[str] = None,
                 dns: Optional[str] = None,
                 drds: Optional[str] = None,
                 dts: Optional[str] = None,
                 eais: Optional[str] = None,
                 eci: Optional[str] = None,
                 ecs: Optional[str] = None,
                 edsuser: Optional[str] = None,
                 ehpc: Optional[str] = None,
                 eipanycast: Optional[str] = None,
                 elasticsearch: Optional[str] = None,
                 emr: Optional[str] = None,
                 ens: Optional[str] = None,
                 ess: Optional[str] = None,
                 eventbridge: Optional[str] = None,
                 fc: Optional[str] = None,
                 fnf: Optional[str] = None,
                 ga: Optional[str] = None,
                 gaplus: Optional[str] = None,
                 gds: Optional[str] = None,
                 gpdb: Optional[str] = None,
                 gwsecd: Optional[str] = None,
                 hbr: Optional[str] = None,
                 hcs_sgw: Optional[str] = None,
                 hitsdb: Optional[str] = None,
                 imm: Optional[str] = None,
                 imp: Optional[str] = None,
                 ims: Optional[str] = None,
                 iot: Optional[str] = None,
                 kms: Optional[str] = None,
                 kvstore: Optional[str] = None,
                 location: Optional[str] = None,
                 log: Optional[str] = None,
                 market: Optional[str] = None,
                 maxcompute: Optional[str] = None,
                 mhub: Optional[str] = None,
                 mns: Optional[str] = None,
                 mscopensubscription: Optional[str] = None,
                 mse: Optional[str] = None,
                 nas: Optional[str] = None,
                 ons: Optional[str] = None,
                 onsproxy: Optional[str] = None,
                 oos: Optional[str] = None,
                 opensearch: Optional[str] = None,
                 oss: Optional[str] = None,
                 ots: Optional[str] = None,
                 polardb: Optional[str] = None,
                 privatelink: Optional[str] = None,
                 pvtz: Optional[str] = None,
                 quickbi: Optional[str] = None,
                 quotas: Optional[str] = None,
                 r_kvstore: Optional[str] = None,
                 ram: Optional[str] = None,
                 rds: Optional[str] = None,
                 redisa: Optional[str] = None,
                 resourcemanager: Optional[str] = None,
                 resourcesharing: Optional[str] = None,
                 ros: Optional[str] = None,
                 sas: Optional[str] = None,
                 scdn: Optional[str] = None,
                 sddp: Optional[str] = None,
                 serverless: Optional[str] = None,
                 servicemesh: Optional[str] = None,
                 sgw: Optional[str] = None,
                 slb: Optional[str] = None,
                 smartag: Optional[str] = None,
                 sts: Optional[str] = None,
                 swas: Optional[str] = None,
                 tag: Optional[str] = None,
                 vod: Optional[str] = None,
                 vpc: Optional[str] = None,
                 vs: Optional[str] = None,
                 waf: Optional[str] = None,
                 waf_openapi: Optional[str] = None):
        if acr is not None:
            pulumi.set(__self__, "acr", acr)
        if actiontrail is not None:
            pulumi.set(__self__, "actiontrail", actiontrail)
        if adb is not None:
            pulumi.set(__self__, "adb", adb)
        if alb is not None:
            pulumi.set(__self__, "alb", alb)
        if alidfs is not None:
            pulumi.set(__self__, "alidfs", alidfs)
        if alidns is not None:
            pulumi.set(__self__, "alidns", alidns)
        if alikafka is not None:
            pulumi.set(__self__, "alikafka", alikafka)
        if apigateway is not None:
            pulumi.set(__self__, "apigateway", apigateway)
        if arms is not None:
            pulumi.set(__self__, "arms", arms)
        if bastionhost is not None:
            pulumi.set(__self__, "bastionhost", bastionhost)
        if brain_industrial is not None:
            pulumi.set(__self__, "brain_industrial", brain_industrial)
        if bssopenapi is not None:
            pulumi.set(__self__, "bssopenapi", bssopenapi)
        if cas is not None:
            pulumi.set(__self__, "cas", cas)
        if cassandra is not None:
            pulumi.set(__self__, "cassandra", cassandra)
        if cbn is not None:
            pulumi.set(__self__, "cbn", cbn)
        if cddc is not None:
            pulumi.set(__self__, "cddc", cddc)
        if cdn is not None:
            pulumi.set(__self__, "cdn", cdn)
        if cds is not None:
            pulumi.set(__self__, "cds", cds)
        if clickhouse is not None:
            pulumi.set(__self__, "clickhouse", clickhouse)
        if cloudauth is not None:
            pulumi.set(__self__, "cloudauth", cloudauth)
        if cloudphone is not None:
            pulumi.set(__self__, "cloudphone", cloudphone)
        if cloudsso is not None:
            pulumi.set(__self__, "cloudsso", cloudsso)
        if cms is not None:
            pulumi.set(__self__, "cms", cms)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if cr is not None:
            pulumi.set(__self__, "cr", cr)
        if cs is not None:
            pulumi.set(__self__, "cs", cs)
        if datahub is not None:
            pulumi.set(__self__, "datahub", datahub)
        if dataworkspublic is not None:
            pulumi.set(__self__, "dataworkspublic", dataworkspublic)
        if dbfs is not None:
            pulumi.set(__self__, "dbfs", dbfs)
        if dcdn is not None:
            pulumi.set(__self__, "dcdn", dcdn)
        if ddosbasic is not None:
            pulumi.set(__self__, "ddosbasic", ddosbasic)
        if ddosbgp is not None:
            pulumi.set(__self__, "ddosbgp", ddosbgp)
        if ddoscoo is not None:
            pulumi.set(__self__, "ddoscoo", ddoscoo)
        if dds is not None:
            pulumi.set(__self__, "dds", dds)
        if devopsrdc is not None:
            pulumi.set(__self__, "devopsrdc", devopsrdc)
        if dg is not None:
            pulumi.set(__self__, "dg", dg)
        if dm is not None:
            pulumi.set(__self__, "dm", dm)
        if dms_enterprise is not None:
            pulumi.set(__self__, "dms_enterprise", dms_enterprise)
        if dns is not None:
            pulumi.set(__self__, "dns", dns)
        if drds is not None:
            pulumi.set(__self__, "drds", drds)
        if dts is not None:
            pulumi.set(__self__, "dts", dts)
        if eais is not None:
            pulumi.set(__self__, "eais", eais)
        if eci is not None:
            pulumi.set(__self__, "eci", eci)
        if ecs is not None:
            pulumi.set(__self__, "ecs", ecs)
        if edsuser is not None:
            pulumi.set(__self__, "edsuser", edsuser)
        if ehpc is not None:
            pulumi.set(__self__, "ehpc", ehpc)
        if eipanycast is not None:
            pulumi.set(__self__, "eipanycast", eipanycast)
        if elasticsearch is not None:
            pulumi.set(__self__, "elasticsearch", elasticsearch)
        if emr is not None:
            pulumi.set(__self__, "emr", emr)
        if ens is not None:
            pulumi.set(__self__, "ens", ens)
        if ess is not None:
            pulumi.set(__self__, "ess", ess)
        if eventbridge is not None:
            pulumi.set(__self__, "eventbridge", eventbridge)
        if fc is not None:
            pulumi.set(__self__, "fc", fc)
        if fnf is not None:
            pulumi.set(__self__, "fnf", fnf)
        if ga is not None:
            pulumi.set(__self__, "ga", ga)
        if gaplus is not None:
            pulumi.set(__self__, "gaplus", gaplus)
        if gds is not None:
            pulumi.set(__self__, "gds", gds)
        if gpdb is not None:
            pulumi.set(__self__, "gpdb", gpdb)
        if gwsecd is not None:
            pulumi.set(__self__, "gwsecd", gwsecd)
        if hbr is not None:
            pulumi.set(__self__, "hbr", hbr)
        if hcs_sgw is not None:
            pulumi.set(__self__, "hcs_sgw", hcs_sgw)
        if hitsdb is not None:
            pulumi.set(__self__, "hitsdb", hitsdb)
        if imm is not None:
            pulumi.set(__self__, "imm", imm)
        if imp is not None:
            pulumi.set(__self__, "imp", imp)
        if ims is not None:
            pulumi.set(__self__, "ims", ims)
        if iot is not None:
            pulumi.set(__self__, "iot", iot)
        if kms is not None:
            pulumi.set(__self__, "kms", kms)
        if kvstore is not None:
            pulumi.set(__self__, "kvstore", kvstore)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if log is not None:
            pulumi.set(__self__, "log", log)
        if market is not None:
            pulumi.set(__self__, "market", market)
        if maxcompute is not None:
            pulumi.set(__self__, "maxcompute", maxcompute)
        if mhub is not None:
            pulumi.set(__self__, "mhub", mhub)
        if mns is not None:
            pulumi.set(__self__, "mns", mns)
        if mscopensubscription is not None:
            pulumi.set(__self__, "mscopensubscription", mscopensubscription)
        if mse is not None:
            pulumi.set(__self__, "mse", mse)
        if nas is not None:
            pulumi.set(__self__, "nas", nas)
        if ons is not None:
            pulumi.set(__self__, "ons", ons)
        if onsproxy is not None:
            pulumi.set(__self__, "onsproxy", onsproxy)
        if oos is not None:
            pulumi.set(__self__, "oos", oos)
        if opensearch is not None:
            pulumi.set(__self__, "opensearch", opensearch)
        if oss is not None:
            pulumi.set(__self__, "oss", oss)
        if ots is not None:
            pulumi.set(__self__, "ots", ots)
        if polardb is not None:
            pulumi.set(__self__, "polardb", polardb)
        if privatelink is not None:
            pulumi.set(__self__, "privatelink", privatelink)
        if pvtz is not None:
            pulumi.set(__self__, "pvtz", pvtz)
        if quickbi is not None:
            pulumi.set(__self__, "quickbi", quickbi)
        if quotas is not None:
            pulumi.set(__self__, "quotas", quotas)
        if r_kvstore is not None:
            pulumi.set(__self__, "r_kvstore", r_kvstore)
        if ram is not None:
            pulumi.set(__self__, "ram", ram)
        if rds is not None:
            pulumi.set(__self__, "rds", rds)
        if redisa is not None:
            pulumi.set(__self__, "redisa", redisa)
        if resourcemanager is not None:
            pulumi.set(__self__, "resourcemanager", resourcemanager)
        if resourcesharing is not None:
            pulumi.set(__self__, "resourcesharing", resourcesharing)
        if ros is not None:
            pulumi.set(__self__, "ros", ros)
        if sas is not None:
            pulumi.set(__self__, "sas", sas)
        if scdn is not None:
            pulumi.set(__self__, "scdn", scdn)
        if sddp is not None:
            pulumi.set(__self__, "sddp", sddp)
        if serverless is not None:
            pulumi.set(__self__, "serverless", serverless)
        if servicemesh is not None:
            pulumi.set(__self__, "servicemesh", servicemesh)
        if sgw is not None:
            pulumi.set(__self__, "sgw", sgw)
        if slb is not None:
            pulumi.set(__self__, "slb", slb)
        if smartag is not None:
            pulumi.set(__self__, "smartag", smartag)
        if sts is not None:
            pulumi.set(__self__, "sts", sts)
        if swas is not None:
            pulumi.set(__self__, "swas", swas)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if vod is not None:
            pulumi.set(__self__, "vod", vod)
        if vpc is not None:
            pulumi.set(__self__, "vpc", vpc)
        if vs is not None:
            pulumi.set(__self__, "vs", vs)
        if waf is not None:
            pulumi.set(__self__, "waf", waf)
        if waf_openapi is not None:
            pulumi.set(__self__, "waf_openapi", waf_openapi)

    @property
    @pulumi.getter
    def acr(self) -> Optional[str]:
        return pulumi.get(self, "acr")

    @property
    @pulumi.getter
    def actiontrail(self) -> Optional[str]:
        return pulumi.get(self, "actiontrail")

    @property
    @pulumi.getter
    def adb(self) -> Optional[str]:
        return pulumi.get(self, "adb")

    @property
    @pulumi.getter
    def alb(self) -> Optional[str]:
        return pulumi.get(self, "alb")

    @property
    @pulumi.getter
    def alidfs(self) -> Optional[str]:
        return pulumi.get(self, "alidfs")

    @property
    @pulumi.getter
    def alidns(self) -> Optional[str]:
        return pulumi.get(self, "alidns")

    @property
    @pulumi.getter
    def alikafka(self) -> Optional[str]:
        return pulumi.get(self, "alikafka")

    @property
    @pulumi.getter
    def apigateway(self) -> Optional[str]:
        return pulumi.get(self, "apigateway")

    @property
    @pulumi.getter
    def arms(self) -> Optional[str]:
        return pulumi.get(self, "arms")

    @property
    @pulumi.getter
    def bastionhost(self) -> Optional[str]:
        return pulumi.get(self, "bastionhost")

    @property
    @pulumi.getter(name="brainIndustrial")
    def brain_industrial(self) -> Optional[str]:
        return pulumi.get(self, "brain_industrial")

    @property
    @pulumi.getter
    def bssopenapi(self) -> Optional[str]:
        return pulumi.get(self, "bssopenapi")

    @property
    @pulumi.getter
    def cas(self) -> Optional[str]:
        return pulumi.get(self, "cas")

    @property
    @pulumi.getter
    def cassandra(self) -> Optional[str]:
        return pulumi.get(self, "cassandra")

    @property
    @pulumi.getter
    def cbn(self) -> Optional[str]:
        return pulumi.get(self, "cbn")

    @property
    @pulumi.getter
    def cddc(self) -> Optional[str]:
        return pulumi.get(self, "cddc")

    @property
    @pulumi.getter
    def cdn(self) -> Optional[str]:
        return pulumi.get(self, "cdn")

    @property
    @pulumi.getter
    def cds(self) -> Optional[str]:
        return pulumi.get(self, "cds")

    @property
    @pulumi.getter
    def clickhouse(self) -> Optional[str]:
        return pulumi.get(self, "clickhouse")

    @property
    @pulumi.getter
    def cloudauth(self) -> Optional[str]:
        return pulumi.get(self, "cloudauth")

    @property
    @pulumi.getter
    def cloudphone(self) -> Optional[str]:
        return pulumi.get(self, "cloudphone")

    @property
    @pulumi.getter
    def cloudsso(self) -> Optional[str]:
        return pulumi.get(self, "cloudsso")

    @property
    @pulumi.getter
    def cms(self) -> Optional[str]:
        return pulumi.get(self, "cms")

    @property
    @pulumi.getter
    def config(self) -> Optional[str]:
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def cr(self) -> Optional[str]:
        return pulumi.get(self, "cr")

    @property
    @pulumi.getter
    def cs(self) -> Optional[str]:
        return pulumi.get(self, "cs")

    @property
    @pulumi.getter
    def datahub(self) -> Optional[str]:
        return pulumi.get(self, "datahub")

    @property
    @pulumi.getter
    def dataworkspublic(self) -> Optional[str]:
        return pulumi.get(self, "dataworkspublic")

    @property
    @pulumi.getter
    def dbfs(self) -> Optional[str]:
        return pulumi.get(self, "dbfs")

    @property
    @pulumi.getter
    def dcdn(self) -> Optional[str]:
        return pulumi.get(self, "dcdn")

    @property
    @pulumi.getter
    def ddosbasic(self) -> Optional[str]:
        return pulumi.get(self, "ddosbasic")

    @property
    @pulumi.getter
    def ddosbgp(self) -> Optional[str]:
        return pulumi.get(self, "ddosbgp")

    @property
    @pulumi.getter
    def ddoscoo(self) -> Optional[str]:
        return pulumi.get(self, "ddoscoo")

    @property
    @pulumi.getter
    def dds(self) -> Optional[str]:
        return pulumi.get(self, "dds")

    @property
    @pulumi.getter
    def devopsrdc(self) -> Optional[str]:
        return pulumi.get(self, "devopsrdc")

    @property
    @pulumi.getter
    def dg(self) -> Optional[str]:
        return pulumi.get(self, "dg")

    @property
    @pulumi.getter
    def dm(self) -> Optional[str]:
        return pulumi.get(self, "dm")

    @property
    @pulumi.getter(name="dmsEnterprise")
    def dms_enterprise(self) -> Optional[str]:
        return pulumi.get(self, "dms_enterprise")

    @property
    @pulumi.getter
    def dns(self) -> Optional[str]:
        return pulumi.get(self, "dns")

    @property
    @pulumi.getter
    def drds(self) -> Optional[str]:
        return pulumi.get(self, "drds")

    @property
    @pulumi.getter
    def dts(self) -> Optional[str]:
        return pulumi.get(self, "dts")

    @property
    @pulumi.getter
    def eais(self) -> Optional[str]:
        return pulumi.get(self, "eais")

    @property
    @pulumi.getter
    def eci(self) -> Optional[str]:
        return pulumi.get(self, "eci")

    @property
    @pulumi.getter
    def ecs(self) -> Optional[str]:
        return pulumi.get(self, "ecs")

    @property
    @pulumi.getter
    def edsuser(self) -> Optional[str]:
        return pulumi.get(self, "edsuser")

    @property
    @pulumi.getter
    def ehpc(self) -> Optional[str]:
        return pulumi.get(self, "ehpc")

    @property
    @pulumi.getter
    def eipanycast(self) -> Optional[str]:
        return pulumi.get(self, "eipanycast")

    @property
    @pulumi.getter
    def elasticsearch(self) -> Optional[str]:
        return pulumi.get(self, "elasticsearch")

    @property
    @pulumi.getter
    def emr(self) -> Optional[str]:
        return pulumi.get(self, "emr")

    @property
    @pulumi.getter
    def ens(self) -> Optional[str]:
        return pulumi.get(self, "ens")

    @property
    @pulumi.getter
    def ess(self) -> Optional[str]:
        return pulumi.get(self, "ess")

    @property
    @pulumi.getter
    def eventbridge(self) -> Optional[str]:
        return pulumi.get(self, "eventbridge")

    @property
    @pulumi.getter
    def fc(self) -> Optional[str]:
        return pulumi.get(self, "fc")

    @property
    @pulumi.getter
    def fnf(self) -> Optional[str]:
        return pulumi.get(self, "fnf")

    @property
    @pulumi.getter
    def ga(self) -> Optional[str]:
        return pulumi.get(self, "ga")

    @property
    @pulumi.getter
    def gaplus(self) -> Optional[str]:
        return pulumi.get(self, "gaplus")

    @property
    @pulumi.getter
    def gds(self) -> Optional[str]:
        return pulumi.get(self, "gds")

    @property
    @pulumi.getter
    def gpdb(self) -> Optional[str]:
        return pulumi.get(self, "gpdb")

    @property
    @pulumi.getter
    def gwsecd(self) -> Optional[str]:
        return pulumi.get(self, "gwsecd")

    @property
    @pulumi.getter
    def hbr(self) -> Optional[str]:
        return pulumi.get(self, "hbr")

    @property
    @pulumi.getter(name="hcsSgw")
    def hcs_sgw(self) -> Optional[str]:
        return pulumi.get(self, "hcs_sgw")

    @property
    @pulumi.getter
    def hitsdb(self) -> Optional[str]:
        return pulumi.get(self, "hitsdb")

    @property
    @pulumi.getter
    def imm(self) -> Optional[str]:
        return pulumi.get(self, "imm")

    @property
    @pulumi.getter
    def imp(self) -> Optional[str]:
        return pulumi.get(self, "imp")

    @property
    @pulumi.getter
    def ims(self) -> Optional[str]:
        return pulumi.get(self, "ims")

    @property
    @pulumi.getter
    def iot(self) -> Optional[str]:
        return pulumi.get(self, "iot")

    @property
    @pulumi.getter
    def kms(self) -> Optional[str]:
        return pulumi.get(self, "kms")

    @property
    @pulumi.getter
    def kvstore(self) -> Optional[str]:
        return pulumi.get(self, "kvstore")

    @property
    @pulumi.getter
    def location(self) -> Optional[str]:
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def log(self) -> Optional[str]:
        return pulumi.get(self, "log")

    @property
    @pulumi.getter
    def market(self) -> Optional[str]:
        return pulumi.get(self, "market")

    @property
    @pulumi.getter
    def maxcompute(self) -> Optional[str]:
        return pulumi.get(self, "maxcompute")

    @property
    @pulumi.getter
    def mhub(self) -> Optional[str]:
        return pulumi.get(self, "mhub")

    @property
    @pulumi.getter
    def mns(self) -> Optional[str]:
        return pulumi.get(self, "mns")

    @property
    @pulumi.getter
    def mscopensubscription(self) -> Optional[str]:
        return pulumi.get(self, "mscopensubscription")

    @property
    @pulumi.getter
    def mse(self) -> Optional[str]:
        return pulumi.get(self, "mse")

    @property
    @pulumi.getter
    def nas(self) -> Optional[str]:
        return pulumi.get(self, "nas")

    @property
    @pulumi.getter
    def ons(self) -> Optional[str]:
        return pulumi.get(self, "ons")

    @property
    @pulumi.getter
    def onsproxy(self) -> Optional[str]:
        return pulumi.get(self, "onsproxy")

    @property
    @pulumi.getter
    def oos(self) -> Optional[str]:
        return pulumi.get(self, "oos")

    @property
    @pulumi.getter
    def opensearch(self) -> Optional[str]:
        return pulumi.get(self, "opensearch")

    @property
    @pulumi.getter
    def oss(self) -> Optional[str]:
        return pulumi.get(self, "oss")

    @property
    @pulumi.getter
    def ots(self) -> Optional[str]:
        return pulumi.get(self, "ots")

    @property
    @pulumi.getter
    def polardb(self) -> Optional[str]:
        return pulumi.get(self, "polardb")

    @property
    @pulumi.getter
    def privatelink(self) -> Optional[str]:
        return pulumi.get(self, "privatelink")

    @property
    @pulumi.getter
    def pvtz(self) -> Optional[str]:
        return pulumi.get(self, "pvtz")

    @property
    @pulumi.getter
    def quickbi(self) -> Optional[str]:
        return pulumi.get(self, "quickbi")

    @property
    @pulumi.getter
    def quotas(self) -> Optional[str]:
        return pulumi.get(self, "quotas")

    @property
    @pulumi.getter(name="rKvstore")
    def r_kvstore(self) -> Optional[str]:
        return pulumi.get(self, "r_kvstore")

    @property
    @pulumi.getter
    def ram(self) -> Optional[str]:
        return pulumi.get(self, "ram")

    @property
    @pulumi.getter
    def rds(self) -> Optional[str]:
        return pulumi.get(self, "rds")

    @property
    @pulumi.getter
    def redisa(self) -> Optional[str]:
        return pulumi.get(self, "redisa")

    @property
    @pulumi.getter
    def resourcemanager(self) -> Optional[str]:
        return pulumi.get(self, "resourcemanager")

    @property
    @pulumi.getter
    def resourcesharing(self) -> Optional[str]:
        return pulumi.get(self, "resourcesharing")

    @property
    @pulumi.getter
    def ros(self) -> Optional[str]:
        return pulumi.get(self, "ros")

    @property
    @pulumi.getter
    def sas(self) -> Optional[str]:
        return pulumi.get(self, "sas")

    @property
    @pulumi.getter
    def scdn(self) -> Optional[str]:
        return pulumi.get(self, "scdn")

    @property
    @pulumi.getter
    def sddp(self) -> Optional[str]:
        return pulumi.get(self, "sddp")

    @property
    @pulumi.getter
    def serverless(self) -> Optional[str]:
        return pulumi.get(self, "serverless")

    @property
    @pulumi.getter
    def servicemesh(self) -> Optional[str]:
        return pulumi.get(self, "servicemesh")

    @property
    @pulumi.getter
    def sgw(self) -> Optional[str]:
        return pulumi.get(self, "sgw")

    @property
    @pulumi.getter
    def slb(self) -> Optional[str]:
        return pulumi.get(self, "slb")

    @property
    @pulumi.getter
    def smartag(self) -> Optional[str]:
        return pulumi.get(self, "smartag")

    @property
    @pulumi.getter
    def sts(self) -> Optional[str]:
        return pulumi.get(self, "sts")

    @property
    @pulumi.getter
    def swas(self) -> Optional[str]:
        return pulumi.get(self, "swas")

    @property
    @pulumi.getter
    def tag(self) -> Optional[str]:
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def vod(self) -> Optional[str]:
        return pulumi.get(self, "vod")

    @property
    @pulumi.getter
    def vpc(self) -> Optional[str]:
        return pulumi.get(self, "vpc")

    @property
    @pulumi.getter
    def vs(self) -> Optional[str]:
        return pulumi.get(self, "vs")

    @property
    @pulumi.getter
    def waf(self) -> Optional[str]:
        return pulumi.get(self, "waf")

    @property
    @pulumi.getter(name="wafOpenapi")
    def waf_openapi(self) -> Optional[str]:
        return pulumi.get(self, "waf_openapi")


