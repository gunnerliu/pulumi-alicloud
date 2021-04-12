# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = [
    'ProviderAssumeRoleArgs',
    'ProviderEndpointArgs',
]

@pulumi.input_type
class ProviderAssumeRoleArgs:
    def __init__(__self__, *,
                 role_arn: pulumi.Input[str],
                 policy: Optional[pulumi.Input[str]] = None,
                 session_expiration: Optional[pulumi.Input[int]] = None,
                 session_name: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "role_arn", role_arn)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if session_expiration is not None:
            pulumi.set(__self__, "session_expiration", session_expiration)
        if session_name is not None:
            pulumi.set(__self__, "session_name", session_name)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="sessionExpiration")
    def session_expiration(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "session_expiration")

    @session_expiration.setter
    def session_expiration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "session_expiration", value)

    @property
    @pulumi.getter(name="sessionName")
    def session_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "session_name")

    @session_name.setter
    def session_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "session_name", value)


@pulumi.input_type
class ProviderEndpointArgs:
    def __init__(__self__, *,
                 actiontrail: Optional[pulumi.Input[str]] = None,
                 adb: Optional[pulumi.Input[str]] = None,
                 alidns: Optional[pulumi.Input[str]] = None,
                 alikafka: Optional[pulumi.Input[str]] = None,
                 apigateway: Optional[pulumi.Input[str]] = None,
                 brain_industrial: Optional[pulumi.Input[str]] = None,
                 bssopenapi: Optional[pulumi.Input[str]] = None,
                 cas: Optional[pulumi.Input[str]] = None,
                 cassandra: Optional[pulumi.Input[str]] = None,
                 cbn: Optional[pulumi.Input[str]] = None,
                 cdn: Optional[pulumi.Input[str]] = None,
                 cen: Optional[pulumi.Input[str]] = None,
                 cms: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 cr: Optional[pulumi.Input[str]] = None,
                 cs: Optional[pulumi.Input[str]] = None,
                 datahub: Optional[pulumi.Input[str]] = None,
                 dcdn: Optional[pulumi.Input[str]] = None,
                 ddosbgp: Optional[pulumi.Input[str]] = None,
                 ddoscoo: Optional[pulumi.Input[str]] = None,
                 dds: Optional[pulumi.Input[str]] = None,
                 dms_enterprise: Optional[pulumi.Input[str]] = None,
                 dns: Optional[pulumi.Input[str]] = None,
                 drds: Optional[pulumi.Input[str]] = None,
                 eci: Optional[pulumi.Input[str]] = None,
                 ecs: Optional[pulumi.Input[str]] = None,
                 eipanycast: Optional[pulumi.Input[str]] = None,
                 elasticsearch: Optional[pulumi.Input[str]] = None,
                 emr: Optional[pulumi.Input[str]] = None,
                 ess: Optional[pulumi.Input[str]] = None,
                 fc: Optional[pulumi.Input[str]] = None,
                 fnf: Optional[pulumi.Input[str]] = None,
                 ga: Optional[pulumi.Input[str]] = None,
                 gpdb: Optional[pulumi.Input[str]] = None,
                 hitsdb: Optional[pulumi.Input[str]] = None,
                 ims: Optional[pulumi.Input[str]] = None,
                 kms: Optional[pulumi.Input[str]] = None,
                 kvstore: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 log: Optional[pulumi.Input[str]] = None,
                 market: Optional[pulumi.Input[str]] = None,
                 maxcompute: Optional[pulumi.Input[str]] = None,
                 mns: Optional[pulumi.Input[str]] = None,
                 mse: Optional[pulumi.Input[str]] = None,
                 nas: Optional[pulumi.Input[str]] = None,
                 ons: Optional[pulumi.Input[str]] = None,
                 oos: Optional[pulumi.Input[str]] = None,
                 oss: Optional[pulumi.Input[str]] = None,
                 ots: Optional[pulumi.Input[str]] = None,
                 polardb: Optional[pulumi.Input[str]] = None,
                 privatelink: Optional[pulumi.Input[str]] = None,
                 pvtz: Optional[pulumi.Input[str]] = None,
                 quotas: Optional[pulumi.Input[str]] = None,
                 r_kvstore: Optional[pulumi.Input[str]] = None,
                 ram: Optional[pulumi.Input[str]] = None,
                 rds: Optional[pulumi.Input[str]] = None,
                 resourcemanager: Optional[pulumi.Input[str]] = None,
                 resourcesharing: Optional[pulumi.Input[str]] = None,
                 ros: Optional[pulumi.Input[str]] = None,
                 sgw: Optional[pulumi.Input[str]] = None,
                 slb: Optional[pulumi.Input[str]] = None,
                 sts: Optional[pulumi.Input[str]] = None,
                 vpc: Optional[pulumi.Input[str]] = None,
                 waf_openapi: Optional[pulumi.Input[str]] = None):
        if actiontrail is not None:
            pulumi.set(__self__, "actiontrail", actiontrail)
        if adb is not None:
            pulumi.set(__self__, "adb", adb)
        if alidns is not None:
            pulumi.set(__self__, "alidns", alidns)
        if alikafka is not None:
            pulumi.set(__self__, "alikafka", alikafka)
        if apigateway is not None:
            pulumi.set(__self__, "apigateway", apigateway)
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
        if cdn is not None:
            pulumi.set(__self__, "cdn", cdn)
        if cen is not None:
            pulumi.set(__self__, "cen", cen)
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
        if dcdn is not None:
            pulumi.set(__self__, "dcdn", dcdn)
        if ddosbgp is not None:
            pulumi.set(__self__, "ddosbgp", ddosbgp)
        if ddoscoo is not None:
            pulumi.set(__self__, "ddoscoo", ddoscoo)
        if dds is not None:
            pulumi.set(__self__, "dds", dds)
        if dms_enterprise is not None:
            pulumi.set(__self__, "dms_enterprise", dms_enterprise)
        if dns is not None:
            pulumi.set(__self__, "dns", dns)
        if drds is not None:
            pulumi.set(__self__, "drds", drds)
        if eci is not None:
            pulumi.set(__self__, "eci", eci)
        if ecs is not None:
            pulumi.set(__self__, "ecs", ecs)
        if eipanycast is not None:
            pulumi.set(__self__, "eipanycast", eipanycast)
        if elasticsearch is not None:
            pulumi.set(__self__, "elasticsearch", elasticsearch)
        if emr is not None:
            pulumi.set(__self__, "emr", emr)
        if ess is not None:
            pulumi.set(__self__, "ess", ess)
        if fc is not None:
            pulumi.set(__self__, "fc", fc)
        if fnf is not None:
            pulumi.set(__self__, "fnf", fnf)
        if ga is not None:
            pulumi.set(__self__, "ga", ga)
        if gpdb is not None:
            pulumi.set(__self__, "gpdb", gpdb)
        if hitsdb is not None:
            pulumi.set(__self__, "hitsdb", hitsdb)
        if ims is not None:
            pulumi.set(__self__, "ims", ims)
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
        if mns is not None:
            pulumi.set(__self__, "mns", mns)
        if mse is not None:
            pulumi.set(__self__, "mse", mse)
        if nas is not None:
            pulumi.set(__self__, "nas", nas)
        if ons is not None:
            pulumi.set(__self__, "ons", ons)
        if oos is not None:
            pulumi.set(__self__, "oos", oos)
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
        if quotas is not None:
            pulumi.set(__self__, "quotas", quotas)
        if r_kvstore is not None:
            pulumi.set(__self__, "r_kvstore", r_kvstore)
        if ram is not None:
            pulumi.set(__self__, "ram", ram)
        if rds is not None:
            pulumi.set(__self__, "rds", rds)
        if resourcemanager is not None:
            pulumi.set(__self__, "resourcemanager", resourcemanager)
        if resourcesharing is not None:
            pulumi.set(__self__, "resourcesharing", resourcesharing)
        if ros is not None:
            pulumi.set(__self__, "ros", ros)
        if sgw is not None:
            pulumi.set(__self__, "sgw", sgw)
        if slb is not None:
            pulumi.set(__self__, "slb", slb)
        if sts is not None:
            pulumi.set(__self__, "sts", sts)
        if vpc is not None:
            pulumi.set(__self__, "vpc", vpc)
        if waf_openapi is not None:
            pulumi.set(__self__, "waf_openapi", waf_openapi)

    @property
    @pulumi.getter
    def actiontrail(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "actiontrail")

    @actiontrail.setter
    def actiontrail(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "actiontrail", value)

    @property
    @pulumi.getter
    def adb(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "adb")

    @adb.setter
    def adb(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "adb", value)

    @property
    @pulumi.getter
    def alidns(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "alidns")

    @alidns.setter
    def alidns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alidns", value)

    @property
    @pulumi.getter
    def alikafka(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "alikafka")

    @alikafka.setter
    def alikafka(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alikafka", value)

    @property
    @pulumi.getter
    def apigateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "apigateway")

    @apigateway.setter
    def apigateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "apigateway", value)

    @property
    @pulumi.getter(name="brainIndustrial")
    def brain_industrial(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "brain_industrial")

    @brain_industrial.setter
    def brain_industrial(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "brain_industrial", value)

    @property
    @pulumi.getter
    def bssopenapi(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bssopenapi")

    @bssopenapi.setter
    def bssopenapi(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bssopenapi", value)

    @property
    @pulumi.getter
    def cas(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cas")

    @cas.setter
    def cas(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cas", value)

    @property
    @pulumi.getter
    def cassandra(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cassandra")

    @cassandra.setter
    def cassandra(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cassandra", value)

    @property
    @pulumi.getter
    def cbn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cbn")

    @cbn.setter
    def cbn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cbn", value)

    @property
    @pulumi.getter
    def cdn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cdn")

    @cdn.setter
    def cdn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cdn", value)

    @property
    @pulumi.getter
    def cen(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cen")

    @cen.setter
    def cen(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen", value)

    @property
    @pulumi.getter
    def cms(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cms")

    @cms.setter
    def cms(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cms", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def cr(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cr")

    @cr.setter
    def cr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cr", value)

    @property
    @pulumi.getter
    def cs(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cs")

    @cs.setter
    def cs(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cs", value)

    @property
    @pulumi.getter
    def datahub(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "datahub")

    @datahub.setter
    def datahub(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datahub", value)

    @property
    @pulumi.getter
    def dcdn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dcdn")

    @dcdn.setter
    def dcdn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dcdn", value)

    @property
    @pulumi.getter
    def ddosbgp(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ddosbgp")

    @ddosbgp.setter
    def ddosbgp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ddosbgp", value)

    @property
    @pulumi.getter
    def ddoscoo(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ddoscoo")

    @ddoscoo.setter
    def ddoscoo(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ddoscoo", value)

    @property
    @pulumi.getter
    def dds(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dds")

    @dds.setter
    def dds(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dds", value)

    @property
    @pulumi.getter(name="dmsEnterprise")
    def dms_enterprise(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dms_enterprise")

    @dms_enterprise.setter
    def dms_enterprise(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dms_enterprise", value)

    @property
    @pulumi.getter
    def dns(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dns")

    @dns.setter
    def dns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dns", value)

    @property
    @pulumi.getter
    def drds(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "drds")

    @drds.setter
    def drds(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "drds", value)

    @property
    @pulumi.getter
    def eci(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "eci")

    @eci.setter
    def eci(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "eci", value)

    @property
    @pulumi.getter
    def ecs(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ecs")

    @ecs.setter
    def ecs(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ecs", value)

    @property
    @pulumi.getter
    def eipanycast(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "eipanycast")

    @eipanycast.setter
    def eipanycast(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "eipanycast", value)

    @property
    @pulumi.getter
    def elasticsearch(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "elasticsearch")

    @elasticsearch.setter
    def elasticsearch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "elasticsearch", value)

    @property
    @pulumi.getter
    def emr(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "emr")

    @emr.setter
    def emr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "emr", value)

    @property
    @pulumi.getter
    def ess(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ess")

    @ess.setter
    def ess(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ess", value)

    @property
    @pulumi.getter
    def fc(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "fc")

    @fc.setter
    def fc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fc", value)

    @property
    @pulumi.getter
    def fnf(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "fnf")

    @fnf.setter
    def fnf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fnf", value)

    @property
    @pulumi.getter
    def ga(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ga")

    @ga.setter
    def ga(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ga", value)

    @property
    @pulumi.getter
    def gpdb(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gpdb")

    @gpdb.setter
    def gpdb(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gpdb", value)

    @property
    @pulumi.getter
    def hitsdb(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "hitsdb")

    @hitsdb.setter
    def hitsdb(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hitsdb", value)

    @property
    @pulumi.getter
    def ims(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ims")

    @ims.setter
    def ims(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ims", value)

    @property
    @pulumi.getter
    def kms(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "kms")

    @kms.setter
    def kms(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms", value)

    @property
    @pulumi.getter
    def kvstore(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "kvstore")

    @kvstore.setter
    def kvstore(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kvstore", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def log(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "log")

    @log.setter
    def log(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log", value)

    @property
    @pulumi.getter
    def market(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "market")

    @market.setter
    def market(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "market", value)

    @property
    @pulumi.getter
    def maxcompute(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "maxcompute")

    @maxcompute.setter
    def maxcompute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maxcompute", value)

    @property
    @pulumi.getter
    def mns(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mns")

    @mns.setter
    def mns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mns", value)

    @property
    @pulumi.getter
    def mse(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mse")

    @mse.setter
    def mse(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mse", value)

    @property
    @pulumi.getter
    def nas(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "nas")

    @nas.setter
    def nas(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nas", value)

    @property
    @pulumi.getter
    def ons(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ons")

    @ons.setter
    def ons(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ons", value)

    @property
    @pulumi.getter
    def oos(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "oos")

    @oos.setter
    def oos(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oos", value)

    @property
    @pulumi.getter
    def oss(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "oss")

    @oss.setter
    def oss(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss", value)

    @property
    @pulumi.getter
    def ots(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ots")

    @ots.setter
    def ots(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ots", value)

    @property
    @pulumi.getter
    def polardb(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "polardb")

    @polardb.setter
    def polardb(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "polardb", value)

    @property
    @pulumi.getter
    def privatelink(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "privatelink")

    @privatelink.setter
    def privatelink(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privatelink", value)

    @property
    @pulumi.getter
    def pvtz(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "pvtz")

    @pvtz.setter
    def pvtz(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pvtz", value)

    @property
    @pulumi.getter
    def quotas(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "quotas")

    @quotas.setter
    def quotas(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "quotas", value)

    @property
    @pulumi.getter(name="rKvstore")
    def r_kvstore(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "r_kvstore")

    @r_kvstore.setter
    def r_kvstore(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "r_kvstore", value)

    @property
    @pulumi.getter
    def ram(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ram")

    @ram.setter
    def ram(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ram", value)

    @property
    @pulumi.getter
    def rds(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "rds")

    @rds.setter
    def rds(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rds", value)

    @property
    @pulumi.getter
    def resourcemanager(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "resourcemanager")

    @resourcemanager.setter
    def resourcemanager(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resourcemanager", value)

    @property
    @pulumi.getter
    def resourcesharing(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "resourcesharing")

    @resourcesharing.setter
    def resourcesharing(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resourcesharing", value)

    @property
    @pulumi.getter
    def ros(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ros")

    @ros.setter
    def ros(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ros", value)

    @property
    @pulumi.getter
    def sgw(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "sgw")

    @sgw.setter
    def sgw(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sgw", value)

    @property
    @pulumi.getter
    def slb(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slb")

    @slb.setter
    def slb(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slb", value)

    @property
    @pulumi.getter
    def sts(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "sts")

    @sts.setter
    def sts(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sts", value)

    @property
    @pulumi.getter
    def vpc(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vpc")

    @vpc.setter
    def vpc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc", value)

    @property
    @pulumi.getter(name="wafOpenapi")
    def waf_openapi(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "waf_openapi")

    @waf_openapi.setter
    def waf_openapi(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "waf_openapi", value)


