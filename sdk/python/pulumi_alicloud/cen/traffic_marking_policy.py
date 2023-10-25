# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TrafficMarkingPolicyArgs', 'TrafficMarkingPolicy']

@pulumi.input_type
class TrafficMarkingPolicyArgs:
    def __init__(__self__, *,
                 marking_dscp: pulumi.Input[int],
                 priority: pulumi.Input[int],
                 transit_router_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 traffic_marking_policy_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TrafficMarkingPolicy resource.
        :param pulumi.Input[int] marking_dscp: The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
        :param pulumi.Input[int] priority: The Priority of the Traffic Marking Policy. Value range: 1~100.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[str] description: The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] traffic_marking_policy_name: The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        """
        TrafficMarkingPolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            marking_dscp=marking_dscp,
            priority=priority,
            transit_router_id=transit_router_id,
            description=description,
            dry_run=dry_run,
            traffic_marking_policy_name=traffic_marking_policy_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             marking_dscp: Optional[pulumi.Input[int]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             transit_router_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             traffic_marking_policy_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if marking_dscp is None and 'markingDscp' in kwargs:
            marking_dscp = kwargs['markingDscp']
        if marking_dscp is None:
            raise TypeError("Missing 'marking_dscp' argument")
        if priority is None:
            raise TypeError("Missing 'priority' argument")
        if transit_router_id is None and 'transitRouterId' in kwargs:
            transit_router_id = kwargs['transitRouterId']
        if transit_router_id is None:
            raise TypeError("Missing 'transit_router_id' argument")
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if traffic_marking_policy_name is None and 'trafficMarkingPolicyName' in kwargs:
            traffic_marking_policy_name = kwargs['trafficMarkingPolicyName']

        _setter("marking_dscp", marking_dscp)
        _setter("priority", priority)
        _setter("transit_router_id", transit_router_id)
        if description is not None:
            _setter("description", description)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if traffic_marking_policy_name is not None:
            _setter("traffic_marking_policy_name", traffic_marking_policy_name)

    @property
    @pulumi.getter(name="markingDscp")
    def marking_dscp(self) -> pulumi.Input[int]:
        """
        The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
        """
        return pulumi.get(self, "marking_dscp")

    @marking_dscp.setter
    def marking_dscp(self, value: pulumi.Input[int]):
        pulumi.set(self, "marking_dscp", value)

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Input[int]:
        """
        The Priority of the Traffic Marking Policy. Value range: 1~100.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[int]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Input[str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="trafficMarkingPolicyName")
    def traffic_marking_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "traffic_marking_policy_name")

    @traffic_marking_policy_name.setter
    def traffic_marking_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_marking_policy_name", value)


@pulumi.input_type
class _TrafficMarkingPolicyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 marking_dscp: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 traffic_marking_policy_id: Optional[pulumi.Input[str]] = None,
                 traffic_marking_policy_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TrafficMarkingPolicy resources.
        :param pulumi.Input[str] description: The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[int] marking_dscp: The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
        :param pulumi.Input[int] priority: The Priority of the Traffic Marking Policy. Value range: 1~100.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] traffic_marking_policy_id: The ID of the Traffic Marking Policy.
        :param pulumi.Input[str] traffic_marking_policy_name: The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        """
        _TrafficMarkingPolicyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            dry_run=dry_run,
            marking_dscp=marking_dscp,
            priority=priority,
            status=status,
            traffic_marking_policy_id=traffic_marking_policy_id,
            traffic_marking_policy_name=traffic_marking_policy_name,
            transit_router_id=transit_router_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             marking_dscp: Optional[pulumi.Input[int]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             status: Optional[pulumi.Input[str]] = None,
             traffic_marking_policy_id: Optional[pulumi.Input[str]] = None,
             traffic_marking_policy_name: Optional[pulumi.Input[str]] = None,
             transit_router_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if marking_dscp is None and 'markingDscp' in kwargs:
            marking_dscp = kwargs['markingDscp']
        if traffic_marking_policy_id is None and 'trafficMarkingPolicyId' in kwargs:
            traffic_marking_policy_id = kwargs['trafficMarkingPolicyId']
        if traffic_marking_policy_name is None and 'trafficMarkingPolicyName' in kwargs:
            traffic_marking_policy_name = kwargs['trafficMarkingPolicyName']
        if transit_router_id is None and 'transitRouterId' in kwargs:
            transit_router_id = kwargs['transitRouterId']

        if description is not None:
            _setter("description", description)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if marking_dscp is not None:
            _setter("marking_dscp", marking_dscp)
        if priority is not None:
            _setter("priority", priority)
        if status is not None:
            _setter("status", status)
        if traffic_marking_policy_id is not None:
            _setter("traffic_marking_policy_id", traffic_marking_policy_id)
        if traffic_marking_policy_name is not None:
            _setter("traffic_marking_policy_name", traffic_marking_policy_name)
        if transit_router_id is not None:
            _setter("transit_router_id", transit_router_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="markingDscp")
    def marking_dscp(self) -> Optional[pulumi.Input[int]]:
        """
        The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
        """
        return pulumi.get(self, "marking_dscp")

    @marking_dscp.setter
    def marking_dscp(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "marking_dscp", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The Priority of the Traffic Marking Policy. Value range: 1~100.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

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

    @property
    @pulumi.getter(name="trafficMarkingPolicyId")
    def traffic_marking_policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Traffic Marking Policy.
        """
        return pulumi.get(self, "traffic_marking_policy_id")

    @traffic_marking_policy_id.setter
    def traffic_marking_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_marking_policy_id", value)

    @property
    @pulumi.getter(name="trafficMarkingPolicyName")
    def traffic_marking_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "traffic_marking_policy_name")

    @traffic_marking_policy_name.setter
    def traffic_marking_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_marking_policy_name", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_id", value)


class TrafficMarkingPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 marking_dscp: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 traffic_marking_policy_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Enterprise Network (CEN) Traffic Marking Policy resource.

        For information about Cloud Enterprise Network (CEN) Traffic Marking Policy and how to use it, see [What is Traffic Marking Policy](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtrafficmarkingpolicy).

        > **NOTE:** Available since v1.173.0.

        ## Import

        Cloud Enterprise Network (CEN) Traffic Marking Policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy example <transit_router_id>:<traffic_marking_policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[int] marking_dscp: The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
        :param pulumi.Input[int] priority: The Priority of the Traffic Marking Policy. Value range: 1~100.
        :param pulumi.Input[str] traffic_marking_policy_name: The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TrafficMarkingPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Enterprise Network (CEN) Traffic Marking Policy resource.

        For information about Cloud Enterprise Network (CEN) Traffic Marking Policy and how to use it, see [What is Traffic Marking Policy](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtrafficmarkingpolicy).

        > **NOTE:** Available since v1.173.0.

        ## Import

        Cloud Enterprise Network (CEN) Traffic Marking Policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy example <transit_router_id>:<traffic_marking_policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param TrafficMarkingPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TrafficMarkingPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TrafficMarkingPolicyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 marking_dscp: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 traffic_marking_policy_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TrafficMarkingPolicyArgs.__new__(TrafficMarkingPolicyArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["dry_run"] = dry_run
            if marking_dscp is None and not opts.urn:
                raise TypeError("Missing required property 'marking_dscp'")
            __props__.__dict__["marking_dscp"] = marking_dscp
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            __props__.__dict__["traffic_marking_policy_name"] = traffic_marking_policy_name
            if transit_router_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_id'")
            __props__.__dict__["transit_router_id"] = transit_router_id
            __props__.__dict__["status"] = None
            __props__.__dict__["traffic_marking_policy_id"] = None
        super(TrafficMarkingPolicy, __self__).__init__(
            'alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            marking_dscp: Optional[pulumi.Input[int]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            traffic_marking_policy_id: Optional[pulumi.Input[str]] = None,
            traffic_marking_policy_name: Optional[pulumi.Input[str]] = None,
            transit_router_id: Optional[pulumi.Input[str]] = None) -> 'TrafficMarkingPolicy':
        """
        Get an existing TrafficMarkingPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[int] marking_dscp: The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
        :param pulumi.Input[int] priority: The Priority of the Traffic Marking Policy. Value range: 1~100.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] traffic_marking_policy_id: The ID of the Traffic Marking Policy.
        :param pulumi.Input[str] traffic_marking_policy_name: The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TrafficMarkingPolicyState.__new__(_TrafficMarkingPolicyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["marking_dscp"] = marking_dscp
        __props__.__dict__["priority"] = priority
        __props__.__dict__["status"] = status
        __props__.__dict__["traffic_marking_policy_id"] = traffic_marking_policy_id
        __props__.__dict__["traffic_marking_policy_name"] = traffic_marking_policy_name
        __props__.__dict__["transit_router_id"] = transit_router_id
        return TrafficMarkingPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="markingDscp")
    def marking_dscp(self) -> pulumi.Output[int]:
        """
        The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
        """
        return pulumi.get(self, "marking_dscp")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The Priority of the Traffic Marking Policy. Value range: 1~100.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="trafficMarkingPolicyId")
    def traffic_marking_policy_id(self) -> pulumi.Output[str]:
        """
        The ID of the Traffic Marking Policy.
        """
        return pulumi.get(self, "traffic_marking_policy_id")

    @property
    @pulumi.getter(name="trafficMarkingPolicyName")
    def traffic_marking_policy_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "traffic_marking_policy_name")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

