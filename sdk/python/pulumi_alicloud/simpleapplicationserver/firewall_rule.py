# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FirewallRuleArgs', 'FirewallRule']

@pulumi.input_type
class FirewallRuleArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 port: pulumi.Input[str],
                 rule_protocol: pulumi.Input[str],
                 remark: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FirewallRule resource.
        :param pulumi.Input[str] instance_id: Alibaba Cloud simple application server instance ID.
        :param pulumi.Input[str] port: The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `<start port number>/<end port number>`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
        :param pulumi.Input[str] rule_protocol: The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
        :param pulumi.Input[str] remark: The remarks of the firewall rule.
        """
        FirewallRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_id=instance_id,
            port=port,
            rule_protocol=rule_protocol,
            remark=remark,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_id: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[str]] = None,
             rule_protocol: Optional[pulumi.Input[str]] = None,
             remark: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if instance_id is None:
            raise TypeError("Missing 'instance_id' argument")
        if port is None:
            raise TypeError("Missing 'port' argument")
        if rule_protocol is None and 'ruleProtocol' in kwargs:
            rule_protocol = kwargs['ruleProtocol']
        if rule_protocol is None:
            raise TypeError("Missing 'rule_protocol' argument")

        _setter("instance_id", instance_id)
        _setter("port", port)
        _setter("rule_protocol", rule_protocol)
        if remark is not None:
            _setter("remark", remark)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Alibaba Cloud simple application server instance ID.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[str]:
        """
        The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `<start port number>/<end port number>`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[str]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="ruleProtocol")
    def rule_protocol(self) -> pulumi.Input[str]:
        """
        The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
        """
        return pulumi.get(self, "rule_protocol")

    @rule_protocol.setter
    def rule_protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "rule_protocol", value)

    @property
    @pulumi.getter
    def remark(self) -> Optional[pulumi.Input[str]]:
        """
        The remarks of the firewall rule.
        """
        return pulumi.get(self, "remark")

    @remark.setter
    def remark(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remark", value)


@pulumi.input_type
class _FirewallRuleState:
    def __init__(__self__, *,
                 firewall_rule_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 remark: Optional[pulumi.Input[str]] = None,
                 rule_protocol: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FirewallRule resources.
        :param pulumi.Input[str] firewall_rule_id: The ID of the firewall rule.
        :param pulumi.Input[str] instance_id: Alibaba Cloud simple application server instance ID.
        :param pulumi.Input[str] port: The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `<start port number>/<end port number>`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
        :param pulumi.Input[str] remark: The remarks of the firewall rule.
        :param pulumi.Input[str] rule_protocol: The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
        """
        _FirewallRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            firewall_rule_id=firewall_rule_id,
            instance_id=instance_id,
            port=port,
            remark=remark,
            rule_protocol=rule_protocol,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             firewall_rule_id: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[str]] = None,
             remark: Optional[pulumi.Input[str]] = None,
             rule_protocol: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if firewall_rule_id is None and 'firewallRuleId' in kwargs:
            firewall_rule_id = kwargs['firewallRuleId']
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if rule_protocol is None and 'ruleProtocol' in kwargs:
            rule_protocol = kwargs['ruleProtocol']

        if firewall_rule_id is not None:
            _setter("firewall_rule_id", firewall_rule_id)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if port is not None:
            _setter("port", port)
        if remark is not None:
            _setter("remark", remark)
        if rule_protocol is not None:
            _setter("rule_protocol", rule_protocol)

    @property
    @pulumi.getter(name="firewallRuleId")
    def firewall_rule_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the firewall rule.
        """
        return pulumi.get(self, "firewall_rule_id")

    @firewall_rule_id.setter
    def firewall_rule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "firewall_rule_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Alibaba Cloud simple application server instance ID.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[str]]:
        """
        The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `<start port number>/<end port number>`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def remark(self) -> Optional[pulumi.Input[str]]:
        """
        The remarks of the firewall rule.
        """
        return pulumi.get(self, "remark")

    @remark.setter
    def remark(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remark", value)

    @property
    @pulumi.getter(name="ruleProtocol")
    def rule_protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
        """
        return pulumi.get(self, "rule_protocol")

    @rule_protocol.setter
    def rule_protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_protocol", value)


class FirewallRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 remark: Optional[pulumi.Input[str]] = None,
                 rule_protocol: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Simple Application Server Firewall Rule resource.

        For information about Simple Application Server Firewall Rule and how to use it, see [What is Firewall Rule](https://www.alibabacloud.com/help/doc-detail/190449.htm).

        > **NOTE:** Available since v1.143.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_images = alicloud.simpleapplicationserver.get_images()
        default_server_plans = alicloud.simpleapplicationserver.get_server_plans()
        default_instance = alicloud.simpleapplicationserver.Instance("defaultInstance",
            payment_type="Subscription",
            plan_id=default_server_plans.plans[0].id,
            instance_name=name,
            image_id=default_images.images[0].id,
            period=1,
            data_disk_size=100)
        default_firewall_rule = alicloud.simpleapplicationserver.FirewallRule("defaultFirewallRule",
            instance_id=default_instance.id,
            rule_protocol="Tcp",
            port="9999",
            remark=name)
        ```

        ## Import

        Simple Application Server Firewall Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:simpleapplicationserver/firewallRule:FirewallRule example <instance_id>:<firewall_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: Alibaba Cloud simple application server instance ID.
        :param pulumi.Input[str] port: The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `<start port number>/<end port number>`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
        :param pulumi.Input[str] remark: The remarks of the firewall rule.
        :param pulumi.Input[str] rule_protocol: The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FirewallRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Simple Application Server Firewall Rule resource.

        For information about Simple Application Server Firewall Rule and how to use it, see [What is Firewall Rule](https://www.alibabacloud.com/help/doc-detail/190449.htm).

        > **NOTE:** Available since v1.143.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_images = alicloud.simpleapplicationserver.get_images()
        default_server_plans = alicloud.simpleapplicationserver.get_server_plans()
        default_instance = alicloud.simpleapplicationserver.Instance("defaultInstance",
            payment_type="Subscription",
            plan_id=default_server_plans.plans[0].id,
            instance_name=name,
            image_id=default_images.images[0].id,
            period=1,
            data_disk_size=100)
        default_firewall_rule = alicloud.simpleapplicationserver.FirewallRule("defaultFirewallRule",
            instance_id=default_instance.id,
            rule_protocol="Tcp",
            port="9999",
            remark=name)
        ```

        ## Import

        Simple Application Server Firewall Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:simpleapplicationserver/firewallRule:FirewallRule example <instance_id>:<firewall_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param FirewallRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FirewallRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 remark: Optional[pulumi.Input[str]] = None,
                 rule_protocol: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallRuleArgs.__new__(FirewallRuleArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if port is None and not opts.urn:
                raise TypeError("Missing required property 'port'")
            __props__.__dict__["port"] = port
            __props__.__dict__["remark"] = remark
            if rule_protocol is None and not opts.urn:
                raise TypeError("Missing required property 'rule_protocol'")
            __props__.__dict__["rule_protocol"] = rule_protocol
            __props__.__dict__["firewall_rule_id"] = None
        super(FirewallRule, __self__).__init__(
            'alicloud:simpleapplicationserver/firewallRule:FirewallRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            firewall_rule_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[str]] = None,
            remark: Optional[pulumi.Input[str]] = None,
            rule_protocol: Optional[pulumi.Input[str]] = None) -> 'FirewallRule':
        """
        Get an existing FirewallRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] firewall_rule_id: The ID of the firewall rule.
        :param pulumi.Input[str] instance_id: Alibaba Cloud simple application server instance ID.
        :param pulumi.Input[str] port: The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `<start port number>/<end port number>`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
        :param pulumi.Input[str] remark: The remarks of the firewall rule.
        :param pulumi.Input[str] rule_protocol: The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallRuleState.__new__(_FirewallRuleState)

        __props__.__dict__["firewall_rule_id"] = firewall_rule_id
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["port"] = port
        __props__.__dict__["remark"] = remark
        __props__.__dict__["rule_protocol"] = rule_protocol
        return FirewallRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="firewallRuleId")
    def firewall_rule_id(self) -> pulumi.Output[str]:
        """
        The ID of the firewall rule.
        """
        return pulumi.get(self, "firewall_rule_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Alibaba Cloud simple application server instance ID.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[str]:
        """
        The port range. Valid values of port numbers: `1` to `65535`. Specify a port range in the format of `<start port number>/<end port number>`. Example: `1024/1055`, which indicates the port range of `1024` through `1055`.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def remark(self) -> pulumi.Output[Optional[str]]:
        """
        The remarks of the firewall rule.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter(name="ruleProtocol")
    def rule_protocol(self) -> pulumi.Output[str]:
        """
        The transport layer protocol. Valid values: `Tcp`, `Udp`, `TcpAndUdp`.
        """
        return pulumi.get(self, "rule_protocol")

