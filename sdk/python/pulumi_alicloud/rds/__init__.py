# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .account import *
from .account_privilege import *
from .backup_policy import *
from .connection import *
from .database import *
from .get_instance_classes import *
from .get_instance_engines import *
from .get_instances import *
from .get_rds_parameter_groups import *
from .get_zones import *
from .instance import *
from .rds_parameter_group import *
from .read_only_instance import *
from .read_write_splitting_connection import *
from ._inputs import *
from . import outputs

def _register_module():
    import pulumi
    from .. import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "alicloud:rds/account:Account":
                return Account(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/accountPrivilege:AccountPrivilege":
                return AccountPrivilege(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/backupPolicy:BackupPolicy":
                return BackupPolicy(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/connection:Connection":
                return Connection(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/database:Database":
                return Database(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/instance:Instance":
                return Instance(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/rdsParameterGroup:RdsParameterGroup":
                return RdsParameterGroup(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/readOnlyInstance:ReadOnlyInstance":
                return ReadOnlyInstance(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "alicloud:rds/readWriteSplittingConnection:ReadWriteSplittingConnection":
                return ReadWriteSplittingConnection(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("alicloud", "rds/account", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/accountPrivilege", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/backupPolicy", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/connection", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/database", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/instance", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/rdsParameterGroup", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/readOnlyInstance", _module_instance)
    pulumi.runtime.register_resource_module("alicloud", "rds/readWriteSplittingConnection", _module_instance)

_register_module()
