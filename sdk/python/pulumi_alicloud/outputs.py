# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'ProviderAssumeRole',
    'ProviderEndpoint',
    'GetRegionsRegionResult',
    'GetZonesZoneResult',
]

@pulumi.output_type
class ProviderAssumeRole(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "roleArn":
            suggest = "role_arn"
        elif key == "sessionExpiration":
            suggest = "session_expiration"
        elif key == "sessionName":
            suggest = "session_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProviderAssumeRole. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProviderAssumeRole.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProviderAssumeRole.__key_warning(key)
        return super().get(key, default)

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
class ProviderEndpoint(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "brainIndustrial":
            suggest = "brain_industrial"
        elif key == "dmsEnterprise":
            suggest = "dms_enterprise"
        elif key == "rKvstore":
            suggest = "r_kvstore"
        elif key == "wafOpenapi":
            suggest = "waf_openapi"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProviderEndpoint. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProviderEndpoint.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProviderEndpoint.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 actiontrail: Optional[str] = None,
                 adb: Optional[str] = None,
                 alidns: Optional[str] = None,
                 alikafka: Optional[str] = None,
                 apigateway: Optional[str] = None,
                 brain_industrial: Optional[str] = None,
                 bssopenapi: Optional[str] = None,
                 cas: Optional[str] = None,
                 cassandra: Optional[str] = None,
                 cbn: Optional[str] = None,
                 cdn: Optional[str] = None,
                 cen: Optional[str] = None,
                 cms: Optional[str] = None,
                 config: Optional[str] = None,
                 cr: Optional[str] = None,
                 cs: Optional[str] = None,
                 datahub: Optional[str] = None,
                 dcdn: Optional[str] = None,
                 ddosbgp: Optional[str] = None,
                 ddoscoo: Optional[str] = None,
                 dds: Optional[str] = None,
                 dms_enterprise: Optional[str] = None,
                 dns: Optional[str] = None,
                 drds: Optional[str] = None,
                 eci: Optional[str] = None,
                 ecs: Optional[str] = None,
                 eipanycast: Optional[str] = None,
                 elasticsearch: Optional[str] = None,
                 emr: Optional[str] = None,
                 ess: Optional[str] = None,
                 fc: Optional[str] = None,
                 fnf: Optional[str] = None,
                 ga: Optional[str] = None,
                 gpdb: Optional[str] = None,
                 hitsdb: Optional[str] = None,
                 ims: Optional[str] = None,
                 kms: Optional[str] = None,
                 kvstore: Optional[str] = None,
                 location: Optional[str] = None,
                 log: Optional[str] = None,
                 market: Optional[str] = None,
                 maxcompute: Optional[str] = None,
                 mns: Optional[str] = None,
                 mse: Optional[str] = None,
                 nas: Optional[str] = None,
                 ons: Optional[str] = None,
                 oos: Optional[str] = None,
                 oss: Optional[str] = None,
                 ots: Optional[str] = None,
                 polardb: Optional[str] = None,
                 privatelink: Optional[str] = None,
                 pvtz: Optional[str] = None,
                 quotas: Optional[str] = None,
                 r_kvstore: Optional[str] = None,
                 ram: Optional[str] = None,
                 rds: Optional[str] = None,
                 resourcemanager: Optional[str] = None,
                 resourcesharing: Optional[str] = None,
                 ros: Optional[str] = None,
                 sgw: Optional[str] = None,
                 slb: Optional[str] = None,
                 sts: Optional[str] = None,
                 vpc: Optional[str] = None,
                 waf_openapi: Optional[str] = None):
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
    def actiontrail(self) -> Optional[str]:
        return pulumi.get(self, "actiontrail")

    @property
    @pulumi.getter
    def adb(self) -> Optional[str]:
        return pulumi.get(self, "adb")

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
    def cdn(self) -> Optional[str]:
        return pulumi.get(self, "cdn")

    @property
    @pulumi.getter
    def cen(self) -> Optional[str]:
        return pulumi.get(self, "cen")

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
    def dcdn(self) -> Optional[str]:
        return pulumi.get(self, "dcdn")

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
    def eci(self) -> Optional[str]:
        return pulumi.get(self, "eci")

    @property
    @pulumi.getter
    def ecs(self) -> Optional[str]:
        return pulumi.get(self, "ecs")

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
    def ess(self) -> Optional[str]:
        return pulumi.get(self, "ess")

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
    def gpdb(self) -> Optional[str]:
        return pulumi.get(self, "gpdb")

    @property
    @pulumi.getter
    def hitsdb(self) -> Optional[str]:
        return pulumi.get(self, "hitsdb")

    @property
    @pulumi.getter
    def ims(self) -> Optional[str]:
        return pulumi.get(self, "ims")

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
    def mns(self) -> Optional[str]:
        return pulumi.get(self, "mns")

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
    def oos(self) -> Optional[str]:
        return pulumi.get(self, "oos")

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
    def sgw(self) -> Optional[str]:
        return pulumi.get(self, "sgw")

    @property
    @pulumi.getter
    def slb(self) -> Optional[str]:
        return pulumi.get(self, "slb")

    @property
    @pulumi.getter
    def sts(self) -> Optional[str]:
        return pulumi.get(self, "sts")

    @property
    @pulumi.getter
    def vpc(self) -> Optional[str]:
        return pulumi.get(self, "vpc")

    @property
    @pulumi.getter(name="wafOpenapi")
    def waf_openapi(self) -> Optional[str]:
        return pulumi.get(self, "waf_openapi")


@pulumi.output_type
class GetRegionsRegionResult(dict):
    def __init__(__self__, *,
                 id: str,
                 local_name: str,
                 region_id: str):
        """
        :param str id: ID of the region.
        :param str local_name: Name of the region in the local language.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "local_name", local_name)
        pulumi.set(__self__, "region_id", region_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the region.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="localName")
    def local_name(self) -> str:
        """
        Name of the region in the local language.
        """
        return pulumi.get(self, "local_name")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        return pulumi.get(self, "region_id")


@pulumi.output_type
class GetZonesZoneResult(dict):
    def __init__(__self__, *,
                 available_disk_categories: Sequence[str],
                 available_instance_types: Sequence[str],
                 available_resource_creations: Sequence[str],
                 id: str,
                 local_name: str,
                 multi_zone_ids: Sequence[str],
                 slb_slave_zone_ids: Sequence[str]):
        """
        :param Sequence[str] available_disk_categories: Set of supported disk categories.
        :param Sequence[str] available_instance_types: Allowed instance types.
        :param Sequence[str] available_resource_creations: Filter the results by a specific resource type.
               Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
        :param str id: ID of the zone.
        :param str local_name: Name of the zone in the local language.
        :param Sequence[str] multi_zone_ids: A list of zone ids in which the multi zone.
        :param Sequence[str] slb_slave_zone_ids: A list of slb slave zone ids in which the slb master zone.
        """
        pulumi.set(__self__, "available_disk_categories", available_disk_categories)
        pulumi.set(__self__, "available_instance_types", available_instance_types)
        pulumi.set(__self__, "available_resource_creations", available_resource_creations)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "local_name", local_name)
        pulumi.set(__self__, "multi_zone_ids", multi_zone_ids)
        pulumi.set(__self__, "slb_slave_zone_ids", slb_slave_zone_ids)

    @property
    @pulumi.getter(name="availableDiskCategories")
    def available_disk_categories(self) -> Sequence[str]:
        """
        Set of supported disk categories.
        """
        return pulumi.get(self, "available_disk_categories")

    @property
    @pulumi.getter(name="availableInstanceTypes")
    def available_instance_types(self) -> Sequence[str]:
        """
        Allowed instance types.
        """
        return pulumi.get(self, "available_instance_types")

    @property
    @pulumi.getter(name="availableResourceCreations")
    def available_resource_creations(self) -> Sequence[str]:
        """
        Filter the results by a specific resource type.
        Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
        """
        return pulumi.get(self, "available_resource_creations")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the zone.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="localName")
    def local_name(self) -> str:
        """
        Name of the zone in the local language.
        """
        return pulumi.get(self, "local_name")

    @property
    @pulumi.getter(name="multiZoneIds")
    def multi_zone_ids(self) -> Sequence[str]:
        """
        A list of zone ids in which the multi zone.
        """
        return pulumi.get(self, "multi_zone_ids")

    @property
    @pulumi.getter(name="slbSlaveZoneIds")
    def slb_slave_zone_ids(self) -> Sequence[str]:
        """
        A list of slb slave zone ids in which the slb master zone.
        """
        return pulumi.get(self, "slb_slave_zone_ids")


