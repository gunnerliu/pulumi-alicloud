# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'ShardingInstanceMongoList',
    'ShardingInstanceShardList',
    'GetInstancesInstanceResult',
    'GetInstancesInstanceMongoResult',
    'GetInstancesInstanceShardResult',
    'GetZonesZoneResult',
]

@pulumi.output_type
class ShardingInstanceMongoList(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "nodeClass":
            suggest = "node_class"
        elif key == "connectString":
            suggest = "connect_string"
        elif key == "nodeId":
            suggest = "node_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ShardingInstanceMongoList. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ShardingInstanceMongoList.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ShardingInstanceMongoList.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 node_class: str,
                 connect_string: Optional[str] = None,
                 node_id: Optional[str] = None,
                 port: Optional[int] = None):
        """
        :param str node_class: -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
        :param str connect_string: Mongo node connection string
        :param str node_id: The ID of the shard-node.
        :param int port: Mongo node port
               * `shard_list`
        """
        pulumi.set(__self__, "node_class", node_class)
        if connect_string is not None:
            pulumi.set(__self__, "connect_string", connect_string)
        if node_id is not None:
            pulumi.set(__self__, "node_id", node_id)
        if port is not None:
            pulumi.set(__self__, "port", port)

    @property
    @pulumi.getter(name="nodeClass")
    def node_class(self) -> str:
        """
        -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
        """
        return pulumi.get(self, "node_class")

    @property
    @pulumi.getter(name="connectString")
    def connect_string(self) -> Optional[str]:
        """
        Mongo node connection string
        """
        return pulumi.get(self, "connect_string")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        """
        The ID of the shard-node.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        Mongo node port
        * `shard_list`
        """
        return pulumi.get(self, "port")


@pulumi.output_type
class ShardingInstanceShardList(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "nodeClass":
            suggest = "node_class"
        elif key == "nodeStorage":
            suggest = "node_storage"
        elif key == "nodeId":
            suggest = "node_id"
        elif key == "readonlyReplicas":
            suggest = "readonly_replicas"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ShardingInstanceShardList. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ShardingInstanceShardList.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ShardingInstanceShardList.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 node_class: str,
                 node_storage: int,
                 node_id: Optional[str] = None,
                 readonly_replicas: Optional[int] = None):
        """
        :param str node_class: -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
        :param int node_storage: - Custom storage space; value range: [10, 1,000]
               - 10-GB increments. Unit: GB.
        :param str node_id: The ID of the shard-node.
        :param int readonly_replicas: The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
        """
        pulumi.set(__self__, "node_class", node_class)
        pulumi.set(__self__, "node_storage", node_storage)
        if node_id is not None:
            pulumi.set(__self__, "node_id", node_id)
        if readonly_replicas is not None:
            pulumi.set(__self__, "readonly_replicas", readonly_replicas)

    @property
    @pulumi.getter(name="nodeClass")
    def node_class(self) -> str:
        """
        -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
        """
        return pulumi.get(self, "node_class")

    @property
    @pulumi.getter(name="nodeStorage")
    def node_storage(self) -> int:
        """
        - Custom storage space; value range: [10, 1,000]
        - 10-GB increments. Unit: GB.
        """
        return pulumi.get(self, "node_storage")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        """
        The ID of the shard-node.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="readonlyReplicas")
    def readonly_replicas(self) -> Optional[int]:
        """
        The number of read-only nodes in shard node. Valid values: 0 to 5. Default value: 0.
        """
        return pulumi.get(self, "readonly_replicas")


@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 availability_zone: str,
                 charge_type: str,
                 creation_time: str,
                 engine: str,
                 engine_version: str,
                 expiration_time: str,
                 id: str,
                 instance_class: str,
                 instance_type: str,
                 lock_mode: str,
                 mongos: Sequence['outputs.GetInstancesInstanceMongoResult'],
                 name: str,
                 network_type: str,
                 region_id: str,
                 replication: str,
                 shards: Sequence['outputs.GetInstancesInstanceShardResult'],
                 status: str,
                 storage: int,
                 tags: Mapping[str, Any]):
        """
        :param str availability_zone: Instance availability zone.
        :param str charge_type: Billing method. Value options are `PostPaid` for  Pay-As-You-Go and `PrePaid` for yearly or monthly subscription.
        :param str creation_time: Creation time of the instance in RFC3339 format.
        :param str engine: Database engine type. Supported option is `MongoDB`.
        :param str engine_version: Database engine version.
        :param str expiration_time: Expiration time in RFC3339 format. Pay-As-You-Go instances are never expire.
        :param str id: The ID of the MongoDB instance.
        :param str instance_class: Sizing of the instance to be queried.
        :param str instance_type: Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
        :param str lock_mode: Lock status of the instance.
        :param Sequence['GetInstancesInstanceMongoArgs'] mongos: Array composed of Mongos.
        :param str name: The name of the MongoDB instance.
        :param str network_type: Classic network or VPC.
        :param str region_id: Region ID the instance belongs to.
        :param str replication: Replication factor corresponds to number of nodes. Optional values are `1` for single node and `3` for three nodes replica set.
        :param Sequence['GetInstancesInstanceShardArgs'] shards: Array composed of shards.
        :param str status: Status of the instance.
        :param int storage: Shard disk.
        :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "availability_zone", availability_zone)
        pulumi.set(__self__, "charge_type", charge_type)
        pulumi.set(__self__, "creation_time", creation_time)
        pulumi.set(__self__, "engine", engine)
        pulumi.set(__self__, "engine_version", engine_version)
        pulumi.set(__self__, "expiration_time", expiration_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_class", instance_class)
        pulumi.set(__self__, "instance_type", instance_type)
        pulumi.set(__self__, "lock_mode", lock_mode)
        pulumi.set(__self__, "mongos", mongos)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "network_type", network_type)
        pulumi.set(__self__, "region_id", region_id)
        pulumi.set(__self__, "replication", replication)
        pulumi.set(__self__, "shards", shards)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "storage", storage)
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> str:
        """
        Instance availability zone.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="chargeType")
    def charge_type(self) -> str:
        """
        Billing method. Value options are `PostPaid` for  Pay-As-You-Go and `PrePaid` for yearly or monthly subscription.
        """
        return pulumi.get(self, "charge_type")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        Creation time of the instance in RFC3339 format.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def engine(self) -> str:
        """
        Database engine type. Supported option is `MongoDB`.
        """
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> str:
        """
        Database engine version.
        """
        return pulumi.get(self, "engine_version")

    @property
    @pulumi.getter(name="expirationTime")
    def expiration_time(self) -> str:
        """
        Expiration time in RFC3339 format. Pay-As-You-Go instances are never expire.
        """
        return pulumi.get(self, "expiration_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the MongoDB instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceClass")
    def instance_class(self) -> str:
        """
        Sizing of the instance to be queried.
        """
        return pulumi.get(self, "instance_class")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> str:
        """
        Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="lockMode")
    def lock_mode(self) -> str:
        """
        Lock status of the instance.
        """
        return pulumi.get(self, "lock_mode")

    @property
    @pulumi.getter
    def mongos(self) -> Sequence['outputs.GetInstancesInstanceMongoResult']:
        """
        Array composed of Mongos.
        """
        return pulumi.get(self, "mongos")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the MongoDB instance.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> str:
        """
        Classic network or VPC.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        """
        Region ID the instance belongs to.
        """
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter
    def replication(self) -> str:
        """
        Replication factor corresponds to number of nodes. Optional values are `1` for single node and `3` for three nodes replica set.
        """
        return pulumi.get(self, "replication")

    @property
    @pulumi.getter
    def shards(self) -> Sequence['outputs.GetInstancesInstanceShardResult']:
        """
        Array composed of shards.
        """
        return pulumi.get(self, "shards")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the instance.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def storage(self) -> int:
        """
        Shard disk.
        """
        return pulumi.get(self, "storage")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, Any]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")


@pulumi.output_type
class GetInstancesInstanceMongoResult(dict):
    def __init__(__self__, *,
                 class_: str,
                 description: str,
                 node_id: str):
        """
        :param str class_: Shard instance specification.
        :param str description: Shard instance description.
        :param str node_id: Shard instance ID.
        """
        pulumi.set(__self__, "class_", class_)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "node_id", node_id)

    @property
    @pulumi.getter(name="class")
    def class_(self) -> str:
        """
        Shard instance specification.
        """
        return pulumi.get(self, "class_")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Shard instance description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> str:
        """
        Shard instance ID.
        """
        return pulumi.get(self, "node_id")


@pulumi.output_type
class GetInstancesInstanceShardResult(dict):
    def __init__(__self__, *,
                 class_: str,
                 description: str,
                 node_id: str,
                 storage: int):
        """
        :param str class_: Shard instance specification.
        :param str description: Shard instance description.
        :param str node_id: Shard instance ID.
        :param int storage: Shard disk.
        """
        pulumi.set(__self__, "class_", class_)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "node_id", node_id)
        pulumi.set(__self__, "storage", storage)

    @property
    @pulumi.getter(name="class")
    def class_(self) -> str:
        """
        Shard instance specification.
        """
        return pulumi.get(self, "class_")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Shard instance description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> str:
        """
        Shard instance ID.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter
    def storage(self) -> int:
        """
        Shard disk.
        """
        return pulumi.get(self, "storage")


@pulumi.output_type
class GetZonesZoneResult(dict):
    def __init__(__self__, *,
                 id: str,
                 multi_zone_ids: Sequence[str]):
        """
        :param str id: ID of the zone.
        :param Sequence[str] multi_zone_ids: A list of zone ids in which the multi zone.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "multi_zone_ids", multi_zone_ids)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the zone.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="multiZoneIds")
    def multi_zone_ids(self) -> Sequence[str]:
        """
        A list of zone ids in which the multi zone.
        """
        return pulumi.get(self, "multi_zone_ids")


