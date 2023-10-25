# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HoneyPotArgs', 'HoneyPot']

@pulumi.input_type
class HoneyPotArgs:
    def __init__(__self__, *,
                 honeypot_image_id: pulumi.Input[str],
                 honeypot_image_name: pulumi.Input[str],
                 honeypot_name: pulumi.Input[str],
                 node_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a HoneyPot resource.
        :param pulumi.Input[str] honeypot_image_id: The image ID of the honeypot.
        :param pulumi.Input[str] honeypot_image_name: Honeypot mirror name.
        :param pulumi.Input[str] honeypot_name: Honeypot custom name.
        :param pulumi.Input[str] node_id: The ID of the honeypot management node.
        """
        HoneyPotArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            honeypot_image_id=honeypot_image_id,
            honeypot_image_name=honeypot_image_name,
            honeypot_name=honeypot_name,
            node_id=node_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             honeypot_image_id: Optional[pulumi.Input[str]] = None,
             honeypot_image_name: Optional[pulumi.Input[str]] = None,
             honeypot_name: Optional[pulumi.Input[str]] = None,
             node_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if honeypot_image_id is None and 'honeypotImageId' in kwargs:
            honeypot_image_id = kwargs['honeypotImageId']
        if honeypot_image_id is None:
            raise TypeError("Missing 'honeypot_image_id' argument")
        if honeypot_image_name is None and 'honeypotImageName' in kwargs:
            honeypot_image_name = kwargs['honeypotImageName']
        if honeypot_image_name is None:
            raise TypeError("Missing 'honeypot_image_name' argument")
        if honeypot_name is None and 'honeypotName' in kwargs:
            honeypot_name = kwargs['honeypotName']
        if honeypot_name is None:
            raise TypeError("Missing 'honeypot_name' argument")
        if node_id is None and 'nodeId' in kwargs:
            node_id = kwargs['nodeId']
        if node_id is None:
            raise TypeError("Missing 'node_id' argument")

        _setter("honeypot_image_id", honeypot_image_id)
        _setter("honeypot_image_name", honeypot_image_name)
        _setter("honeypot_name", honeypot_name)
        _setter("node_id", node_id)

    @property
    @pulumi.getter(name="honeypotImageId")
    def honeypot_image_id(self) -> pulumi.Input[str]:
        """
        The image ID of the honeypot.
        """
        return pulumi.get(self, "honeypot_image_id")

    @honeypot_image_id.setter
    def honeypot_image_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "honeypot_image_id", value)

    @property
    @pulumi.getter(name="honeypotImageName")
    def honeypot_image_name(self) -> pulumi.Input[str]:
        """
        Honeypot mirror name.
        """
        return pulumi.get(self, "honeypot_image_name")

    @honeypot_image_name.setter
    def honeypot_image_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "honeypot_image_name", value)

    @property
    @pulumi.getter(name="honeypotName")
    def honeypot_name(self) -> pulumi.Input[str]:
        """
        Honeypot custom name.
        """
        return pulumi.get(self, "honeypot_name")

    @honeypot_name.setter
    def honeypot_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "honeypot_name", value)

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> pulumi.Input[str]:
        """
        The ID of the honeypot management node.
        """
        return pulumi.get(self, "node_id")

    @node_id.setter
    def node_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "node_id", value)


@pulumi.input_type
class _HoneyPotState:
    def __init__(__self__, *,
                 honeypot_id: Optional[pulumi.Input[str]] = None,
                 honeypot_image_id: Optional[pulumi.Input[str]] = None,
                 honeypot_image_name: Optional[pulumi.Input[str]] = None,
                 honeypot_name: Optional[pulumi.Input[str]] = None,
                 node_id: Optional[pulumi.Input[str]] = None,
                 preset_id: Optional[pulumi.Input[str]] = None,
                 states: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HoneyPot resources.
        :param pulumi.Input[str] honeypot_id: Honeypot ID.
        :param pulumi.Input[str] honeypot_image_id: The image ID of the honeypot.
        :param pulumi.Input[str] honeypot_image_name: Honeypot mirror name.
        :param pulumi.Input[str] honeypot_name: Honeypot custom name.
        :param pulumi.Input[str] node_id: The ID of the honeypot management node.
        :param pulumi.Input[str] preset_id: The custom parameter ID of honeypot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] states: Honeypot status.
        :param pulumi.Input[str] status: The status of the resource.
        """
        _HoneyPotState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            honeypot_id=honeypot_id,
            honeypot_image_id=honeypot_image_id,
            honeypot_image_name=honeypot_image_name,
            honeypot_name=honeypot_name,
            node_id=node_id,
            preset_id=preset_id,
            states=states,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             honeypot_id: Optional[pulumi.Input[str]] = None,
             honeypot_image_id: Optional[pulumi.Input[str]] = None,
             honeypot_image_name: Optional[pulumi.Input[str]] = None,
             honeypot_name: Optional[pulumi.Input[str]] = None,
             node_id: Optional[pulumi.Input[str]] = None,
             preset_id: Optional[pulumi.Input[str]] = None,
             states: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if honeypot_id is None and 'honeypotId' in kwargs:
            honeypot_id = kwargs['honeypotId']
        if honeypot_image_id is None and 'honeypotImageId' in kwargs:
            honeypot_image_id = kwargs['honeypotImageId']
        if honeypot_image_name is None and 'honeypotImageName' in kwargs:
            honeypot_image_name = kwargs['honeypotImageName']
        if honeypot_name is None and 'honeypotName' in kwargs:
            honeypot_name = kwargs['honeypotName']
        if node_id is None and 'nodeId' in kwargs:
            node_id = kwargs['nodeId']
        if preset_id is None and 'presetId' in kwargs:
            preset_id = kwargs['presetId']

        if honeypot_id is not None:
            _setter("honeypot_id", honeypot_id)
        if honeypot_image_id is not None:
            _setter("honeypot_image_id", honeypot_image_id)
        if honeypot_image_name is not None:
            _setter("honeypot_image_name", honeypot_image_name)
        if honeypot_name is not None:
            _setter("honeypot_name", honeypot_name)
        if node_id is not None:
            _setter("node_id", node_id)
        if preset_id is not None:
            _setter("preset_id", preset_id)
        if states is not None:
            _setter("states", states)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="honeypotId")
    def honeypot_id(self) -> Optional[pulumi.Input[str]]:
        """
        Honeypot ID.
        """
        return pulumi.get(self, "honeypot_id")

    @honeypot_id.setter
    def honeypot_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "honeypot_id", value)

    @property
    @pulumi.getter(name="honeypotImageId")
    def honeypot_image_id(self) -> Optional[pulumi.Input[str]]:
        """
        The image ID of the honeypot.
        """
        return pulumi.get(self, "honeypot_image_id")

    @honeypot_image_id.setter
    def honeypot_image_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "honeypot_image_id", value)

    @property
    @pulumi.getter(name="honeypotImageName")
    def honeypot_image_name(self) -> Optional[pulumi.Input[str]]:
        """
        Honeypot mirror name.
        """
        return pulumi.get(self, "honeypot_image_name")

    @honeypot_image_name.setter
    def honeypot_image_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "honeypot_image_name", value)

    @property
    @pulumi.getter(name="honeypotName")
    def honeypot_name(self) -> Optional[pulumi.Input[str]]:
        """
        Honeypot custom name.
        """
        return pulumi.get(self, "honeypot_name")

    @honeypot_name.setter
    def honeypot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "honeypot_name", value)

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the honeypot management node.
        """
        return pulumi.get(self, "node_id")

    @node_id.setter
    def node_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_id", value)

    @property
    @pulumi.getter(name="presetId")
    def preset_id(self) -> Optional[pulumi.Input[str]]:
        """
        The custom parameter ID of honeypot.
        """
        return pulumi.get(self, "preset_id")

    @preset_id.setter
    def preset_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "preset_id", value)

    @property
    @pulumi.getter
    def states(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Honeypot status.
        """
        return pulumi.get(self, "states")

    @states.setter
    def states(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "states", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class HoneyPot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 honeypot_image_id: Optional[pulumi.Input[str]] = None,
                 honeypot_image_name: Optional[pulumi.Input[str]] = None,
                 honeypot_name: Optional[pulumi.Input[str]] = None,
                 node_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Threat Detection Honey Pot resource.

        For information about Threat Detection Honey Pot and how to use it, see [What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot).

        > **NOTE:** Available since v1.195.0.

        ## Import

        Threat Detection Honey Pot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/honeyPot:HoneyPot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] honeypot_image_id: The image ID of the honeypot.
        :param pulumi.Input[str] honeypot_image_name: Honeypot mirror name.
        :param pulumi.Input[str] honeypot_name: Honeypot custom name.
        :param pulumi.Input[str] node_id: The ID of the honeypot management node.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HoneyPotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Threat Detection Honey Pot resource.

        For information about Threat Detection Honey Pot and how to use it, see [What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot).

        > **NOTE:** Available since v1.195.0.

        ## Import

        Threat Detection Honey Pot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/honeyPot:HoneyPot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param HoneyPotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HoneyPotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            HoneyPotArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 honeypot_image_id: Optional[pulumi.Input[str]] = None,
                 honeypot_image_name: Optional[pulumi.Input[str]] = None,
                 honeypot_name: Optional[pulumi.Input[str]] = None,
                 node_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HoneyPotArgs.__new__(HoneyPotArgs)

            if honeypot_image_id is None and not opts.urn:
                raise TypeError("Missing required property 'honeypot_image_id'")
            __props__.__dict__["honeypot_image_id"] = honeypot_image_id
            if honeypot_image_name is None and not opts.urn:
                raise TypeError("Missing required property 'honeypot_image_name'")
            __props__.__dict__["honeypot_image_name"] = honeypot_image_name
            if honeypot_name is None and not opts.urn:
                raise TypeError("Missing required property 'honeypot_name'")
            __props__.__dict__["honeypot_name"] = honeypot_name
            if node_id is None and not opts.urn:
                raise TypeError("Missing required property 'node_id'")
            __props__.__dict__["node_id"] = node_id
            __props__.__dict__["honeypot_id"] = None
            __props__.__dict__["preset_id"] = None
            __props__.__dict__["states"] = None
            __props__.__dict__["status"] = None
        super(HoneyPot, __self__).__init__(
            'alicloud:threatdetection/honeyPot:HoneyPot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            honeypot_id: Optional[pulumi.Input[str]] = None,
            honeypot_image_id: Optional[pulumi.Input[str]] = None,
            honeypot_image_name: Optional[pulumi.Input[str]] = None,
            honeypot_name: Optional[pulumi.Input[str]] = None,
            node_id: Optional[pulumi.Input[str]] = None,
            preset_id: Optional[pulumi.Input[str]] = None,
            states: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'HoneyPot':
        """
        Get an existing HoneyPot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] honeypot_id: Honeypot ID.
        :param pulumi.Input[str] honeypot_image_id: The image ID of the honeypot.
        :param pulumi.Input[str] honeypot_image_name: Honeypot mirror name.
        :param pulumi.Input[str] honeypot_name: Honeypot custom name.
        :param pulumi.Input[str] node_id: The ID of the honeypot management node.
        :param pulumi.Input[str] preset_id: The custom parameter ID of honeypot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] states: Honeypot status.
        :param pulumi.Input[str] status: The status of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HoneyPotState.__new__(_HoneyPotState)

        __props__.__dict__["honeypot_id"] = honeypot_id
        __props__.__dict__["honeypot_image_id"] = honeypot_image_id
        __props__.__dict__["honeypot_image_name"] = honeypot_image_name
        __props__.__dict__["honeypot_name"] = honeypot_name
        __props__.__dict__["node_id"] = node_id
        __props__.__dict__["preset_id"] = preset_id
        __props__.__dict__["states"] = states
        __props__.__dict__["status"] = status
        return HoneyPot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="honeypotId")
    def honeypot_id(self) -> pulumi.Output[str]:
        """
        Honeypot ID.
        """
        return pulumi.get(self, "honeypot_id")

    @property
    @pulumi.getter(name="honeypotImageId")
    def honeypot_image_id(self) -> pulumi.Output[str]:
        """
        The image ID of the honeypot.
        """
        return pulumi.get(self, "honeypot_image_id")

    @property
    @pulumi.getter(name="honeypotImageName")
    def honeypot_image_name(self) -> pulumi.Output[str]:
        """
        Honeypot mirror name.
        """
        return pulumi.get(self, "honeypot_image_name")

    @property
    @pulumi.getter(name="honeypotName")
    def honeypot_name(self) -> pulumi.Output[str]:
        """
        Honeypot custom name.
        """
        return pulumi.get(self, "honeypot_name")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> pulumi.Output[str]:
        """
        The ID of the honeypot management node.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="presetId")
    def preset_id(self) -> pulumi.Output[str]:
        """
        The custom parameter ID of honeypot.
        """
        return pulumi.get(self, "preset_id")

    @property
    @pulumi.getter
    def states(self) -> pulumi.Output[Sequence[str]]:
        """
        Honeypot status.
        """
        return pulumi.get(self, "states")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

