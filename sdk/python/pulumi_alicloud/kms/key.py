# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Key(pulumi.CustomResource):
    arn: pulumi.Output[str]
    """
    The Alicloud Resource Name (ARN) of the key.
    * `creation_date` -The date and time when the CMK was created. The time is displayed in UTC.
    * `creator` -The creator of the CMK.
    * `delete_date` -The scheduled date to delete CMK. The time is displayed in UTC. This value is returned only when the KeyState value is PendingDeletion.
    """
    automatic_rotation: pulumi.Output[str]
    """
    Specifies whether to enable automatic key rotation. Default:"Disabled".
    """
    creation_date: pulumi.Output[str]
    creator: pulumi.Output[str]
    delete_date: pulumi.Output[str]
    deletion_window_in_days: pulumi.Output[float]
    """
    Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead.
    """
    description: pulumi.Output[str]
    """
    The description of the key as viewed in Alicloud console.
    """
    is_enabled: pulumi.Output[bool]
    """
    Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead.
    """
    key_spec: pulumi.Output[str]
    """
    The type of the CMK.
    """
    key_state: pulumi.Output[str]
    """
    The status of CMK. Defaults to Enabled.
    """
    key_usage: pulumi.Output[str]
    """
    Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
    """
    last_rotation_date: pulumi.Output[str]
    """
    The date and time the last rotation was performed. The time is displayed in UTC. 
    """
    material_expire_time: pulumi.Output[str]
    """
    The time and date the key material for the CMK expires. The time is displayed in UTC. If the value is empty, the key material for the CMK does not expire.
    """
    next_rotation_date: pulumi.Output[str]
    """
    The time the next rotation is scheduled for execution. 
    """
    origin: pulumi.Output[str]
    """
    The source of the key material for the CMK. Defaults to "Aliyun_KMS".
    """
    pending_window_in_days: pulumi.Output[float]
    """
    Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
    """
    primary_key_version: pulumi.Output[str]
    """
    The ID of the current primary key version of the symmetric CMK. 
    """
    protection_level: pulumi.Output[str]
    """
    The protection level of the CMK. Defaults to "SOFTWARE".
    """
    rotation_interval: pulumi.Output[str]
    """
    The period of automatic key rotation. Unit: seconds. 
    """
    def __init__(__self__, resource_name, opts=None, automatic_rotation=None, deletion_window_in_days=None, description=None, is_enabled=None, key_spec=None, key_state=None, key_usage=None, origin=None, pending_window_in_days=None, protection_level=None, rotation_interval=None, __props__=None, __name__=None, __opts__=None):
        """
        A kms key can help user to protect data security in the transmission process. For information about Alikms Key and how to use it, see [What is Resource Alikms Key](https://www.alibabacloud.com/help/doc-detail/28947.htm).

        > **NOTE:** Available in v1.85.0+.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        key = alicloud.kms.Key("key",
            description="Hello KMS",
            key_state="Enabled",
            pending_window_in_days="7")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] automatic_rotation: Specifies whether to enable automatic key rotation. Default:"Disabled".
        :param pulumi.Input[float] deletion_window_in_days: Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead.
        :param pulumi.Input[str] description: The description of the key as viewed in Alicloud console.
        :param pulumi.Input[bool] is_enabled: Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead.
        :param pulumi.Input[str] key_spec: The type of the CMK.
        :param pulumi.Input[str] key_state: The status of CMK. Defaults to Enabled.
        :param pulumi.Input[str] key_usage: Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
        :param pulumi.Input[str] origin: The source of the key material for the CMK. Defaults to "Aliyun_KMS".
        :param pulumi.Input[float] pending_window_in_days: Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
        :param pulumi.Input[str] protection_level: The protection level of the CMK. Defaults to "SOFTWARE".
        :param pulumi.Input[str] rotation_interval: The period of automatic key rotation. Unit: seconds. 
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['automatic_rotation'] = automatic_rotation
            __props__['deletion_window_in_days'] = deletion_window_in_days
            __props__['description'] = description
            __props__['is_enabled'] = is_enabled
            __props__['key_spec'] = key_spec
            __props__['key_state'] = key_state
            __props__['key_usage'] = key_usage
            __props__['origin'] = origin
            __props__['pending_window_in_days'] = pending_window_in_days
            __props__['protection_level'] = protection_level
            __props__['rotation_interval'] = rotation_interval
            __props__['arn'] = None
            __props__['creation_date'] = None
            __props__['creator'] = None
            __props__['delete_date'] = None
            __props__['last_rotation_date'] = None
            __props__['material_expire_time'] = None
            __props__['next_rotation_date'] = None
            __props__['primary_key_version'] = None
        super(Key, __self__).__init__(
            'alicloud:kms/key:Key',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, arn=None, automatic_rotation=None, creation_date=None, creator=None, delete_date=None, deletion_window_in_days=None, description=None, is_enabled=None, key_spec=None, key_state=None, key_usage=None, last_rotation_date=None, material_expire_time=None, next_rotation_date=None, origin=None, pending_window_in_days=None, primary_key_version=None, protection_level=None, rotation_interval=None):
        """
        Get an existing Key resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Alicloud Resource Name (ARN) of the key.
               * `creation_date` -The date and time when the CMK was created. The time is displayed in UTC.
               * `creator` -The creator of the CMK.
               * `delete_date` -The scheduled date to delete CMK. The time is displayed in UTC. This value is returned only when the KeyState value is PendingDeletion.
        :param pulumi.Input[str] automatic_rotation: Specifies whether to enable automatic key rotation. Default:"Disabled".
        :param pulumi.Input[float] deletion_window_in_days: Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead.
        :param pulumi.Input[str] description: The description of the key as viewed in Alicloud console.
        :param pulumi.Input[bool] is_enabled: Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead.
        :param pulumi.Input[str] key_spec: The type of the CMK.
        :param pulumi.Input[str] key_state: The status of CMK. Defaults to Enabled.
        :param pulumi.Input[str] key_usage: Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
        :param pulumi.Input[str] last_rotation_date: The date and time the last rotation was performed. The time is displayed in UTC. 
        :param pulumi.Input[str] material_expire_time: The time and date the key material for the CMK expires. The time is displayed in UTC. If the value is empty, the key material for the CMK does not expire.
        :param pulumi.Input[str] next_rotation_date: The time the next rotation is scheduled for execution. 
        :param pulumi.Input[str] origin: The source of the key material for the CMK. Defaults to "Aliyun_KMS".
        :param pulumi.Input[float] pending_window_in_days: Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
        :param pulumi.Input[str] primary_key_version: The ID of the current primary key version of the symmetric CMK. 
        :param pulumi.Input[str] protection_level: The protection level of the CMK. Defaults to "SOFTWARE".
        :param pulumi.Input[str] rotation_interval: The period of automatic key rotation. Unit: seconds. 
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["arn"] = arn
        __props__["automatic_rotation"] = automatic_rotation
        __props__["creation_date"] = creation_date
        __props__["creator"] = creator
        __props__["delete_date"] = delete_date
        __props__["deletion_window_in_days"] = deletion_window_in_days
        __props__["description"] = description
        __props__["is_enabled"] = is_enabled
        __props__["key_spec"] = key_spec
        __props__["key_state"] = key_state
        __props__["key_usage"] = key_usage
        __props__["last_rotation_date"] = last_rotation_date
        __props__["material_expire_time"] = material_expire_time
        __props__["next_rotation_date"] = next_rotation_date
        __props__["origin"] = origin
        __props__["pending_window_in_days"] = pending_window_in_days
        __props__["primary_key_version"] = primary_key_version
        __props__["protection_level"] = protection_level
        __props__["rotation_interval"] = rotation_interval
        return Key(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

