# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['Connection']


class Connection(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_string_prefix: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Operate the public network ip of the specified resource. How to use it, see [What is Resource Alicloud KVStore Connection](https://www.alibabacloud.com/help/doc-detail/125795.htm).

        > **NOTE:** Available in v1.101.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.kvstore.Connection("default",
            connection_string_prefix="allocatetestupdate",
            instance_id="r-abc123456",
            port="6370")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_string_prefix: The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] port: The service port number of the instance.
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if connection_string_prefix is None:
                raise TypeError("Missing required property 'connection_string_prefix'")
            __props__['connection_string_prefix'] = connection_string_prefix
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
            if port is None:
                raise TypeError("Missing required property 'port'")
            __props__['port'] = port
            __props__['connection_string'] = None
        super(Connection, __self__).__init__(
            'alicloud:kvstore/connection:Connection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_string: Optional[pulumi.Input[str]] = None,
            connection_string_prefix: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[str]] = None) -> 'Connection':
        """
        Get an existing Connection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_string: The public connection string of KVStore DBInstance.
        :param pulumi.Input[str] connection_string_prefix: The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] port: The service port number of the instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["connection_string"] = connection_string
        __props__["connection_string_prefix"] = connection_string_prefix
        __props__["instance_id"] = instance_id
        __props__["port"] = port
        return Connection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Output[str]:
        """
        The public connection string of KVStore DBInstance.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="connectionStringPrefix")
    def connection_string_prefix(self) -> pulumi.Output[str]:
        """
        The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
        """
        return pulumi.get(self, "connection_string_prefix")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[str]:
        """
        The service port number of the instance.
        """
        return pulumi.get(self, "port")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

