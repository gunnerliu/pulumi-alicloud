# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TrafficMirrorFilterArgs', 'TrafficMirrorFilter']

@pulumi.input_type
class TrafficMirrorFilterArgs:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 egress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]] = None,
                 ingress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 traffic_mirror_filter_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_filter_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TrafficMirrorFilter resource.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck only this request. Value:
               - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
               - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
        :param pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]] egress_rules: Information about the outbound rule. See the following `Block EgressRules`.
        :param pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]] ingress_rules: Inward direction rule information. See the following `Block IngressRules`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the VPC belongs.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of this resource.
        :param pulumi.Input[str] traffic_mirror_filter_description: The description of the TrafficMirrorFilter.
        :param pulumi.Input[str] traffic_mirror_filter_name: The name of the TrafficMirrorFilter.
        """
        TrafficMirrorFilterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dry_run=dry_run,
            egress_rules=egress_rules,
            ingress_rules=ingress_rules,
            resource_group_id=resource_group_id,
            tags=tags,
            traffic_mirror_filter_description=traffic_mirror_filter_description,
            traffic_mirror_filter_name=traffic_mirror_filter_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dry_run: Optional[pulumi.Input[bool]] = None,
             egress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]] = None,
             ingress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             traffic_mirror_filter_description: Optional[pulumi.Input[str]] = None,
             traffic_mirror_filter_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if egress_rules is None and 'egressRules' in kwargs:
            egress_rules = kwargs['egressRules']
        if ingress_rules is None and 'ingressRules' in kwargs:
            ingress_rules = kwargs['ingressRules']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if traffic_mirror_filter_description is None and 'trafficMirrorFilterDescription' in kwargs:
            traffic_mirror_filter_description = kwargs['trafficMirrorFilterDescription']
        if traffic_mirror_filter_name is None and 'trafficMirrorFilterName' in kwargs:
            traffic_mirror_filter_name = kwargs['trafficMirrorFilterName']

        if dry_run is not None:
            _setter("dry_run", dry_run)
        if egress_rules is not None:
            _setter("egress_rules", egress_rules)
        if ingress_rules is not None:
            _setter("ingress_rules", ingress_rules)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if tags is not None:
            _setter("tags", tags)
        if traffic_mirror_filter_description is not None:
            _setter("traffic_mirror_filter_description", traffic_mirror_filter_description)
        if traffic_mirror_filter_name is not None:
            _setter("traffic_mirror_filter_name", traffic_mirror_filter_name)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to PreCheck only this request. Value:
        - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
        - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="egressRules")
    def egress_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]]:
        """
        Information about the outbound rule. See the following `Block EgressRules`.
        """
        return pulumi.get(self, "egress_rules")

    @egress_rules.setter
    def egress_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]]):
        pulumi.set(self, "egress_rules", value)

    @property
    @pulumi.getter(name="ingressRules")
    def ingress_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]]:
        """
        Inward direction rule information. See the following `Block IngressRules`.
        """
        return pulumi.get(self, "ingress_rules")

    @ingress_rules.setter
    def ingress_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]]):
        pulumi.set(self, "ingress_rules", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group to which the VPC belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tags of this resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="trafficMirrorFilterDescription")
    def traffic_mirror_filter_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the TrafficMirrorFilter.
        """
        return pulumi.get(self, "traffic_mirror_filter_description")

    @traffic_mirror_filter_description.setter
    def traffic_mirror_filter_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_filter_description", value)

    @property
    @pulumi.getter(name="trafficMirrorFilterName")
    def traffic_mirror_filter_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the TrafficMirrorFilter.
        """
        return pulumi.get(self, "traffic_mirror_filter_name")

    @traffic_mirror_filter_name.setter
    def traffic_mirror_filter_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_filter_name", value)


@pulumi.input_type
class _TrafficMirrorFilterState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 egress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]] = None,
                 ingress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 traffic_mirror_filter_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_filter_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TrafficMirrorFilter resources.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck only this request. Value:
               - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
               - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
        :param pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]] egress_rules: Information about the outbound rule. See the following `Block EgressRules`.
        :param pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]] ingress_rules: Inward direction rule information. See the following `Block IngressRules`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the VPC belongs.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of this resource.
        :param pulumi.Input[str] traffic_mirror_filter_description: The description of the TrafficMirrorFilter.
        :param pulumi.Input[str] traffic_mirror_filter_name: The name of the TrafficMirrorFilter.
        """
        _TrafficMirrorFilterState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dry_run=dry_run,
            egress_rules=egress_rules,
            ingress_rules=ingress_rules,
            resource_group_id=resource_group_id,
            status=status,
            tags=tags,
            traffic_mirror_filter_description=traffic_mirror_filter_description,
            traffic_mirror_filter_name=traffic_mirror_filter_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dry_run: Optional[pulumi.Input[bool]] = None,
             egress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]] = None,
             ingress_rules: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             traffic_mirror_filter_description: Optional[pulumi.Input[str]] = None,
             traffic_mirror_filter_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if egress_rules is None and 'egressRules' in kwargs:
            egress_rules = kwargs['egressRules']
        if ingress_rules is None and 'ingressRules' in kwargs:
            ingress_rules = kwargs['ingressRules']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if traffic_mirror_filter_description is None and 'trafficMirrorFilterDescription' in kwargs:
            traffic_mirror_filter_description = kwargs['trafficMirrorFilterDescription']
        if traffic_mirror_filter_name is None and 'trafficMirrorFilterName' in kwargs:
            traffic_mirror_filter_name = kwargs['trafficMirrorFilterName']

        if dry_run is not None:
            _setter("dry_run", dry_run)
        if egress_rules is not None:
            _setter("egress_rules", egress_rules)
        if ingress_rules is not None:
            _setter("ingress_rules", ingress_rules)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if status is not None:
            _setter("status", status)
        if tags is not None:
            _setter("tags", tags)
        if traffic_mirror_filter_description is not None:
            _setter("traffic_mirror_filter_description", traffic_mirror_filter_description)
        if traffic_mirror_filter_name is not None:
            _setter("traffic_mirror_filter_name", traffic_mirror_filter_name)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to PreCheck only this request. Value:
        - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
        - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="egressRules")
    def egress_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]]:
        """
        Information about the outbound rule. See the following `Block EgressRules`.
        """
        return pulumi.get(self, "egress_rules")

    @egress_rules.setter
    def egress_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterEgressRuleArgs']]]]):
        pulumi.set(self, "egress_rules", value)

    @property
    @pulumi.getter(name="ingressRules")
    def ingress_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]]:
        """
        Inward direction rule information. See the following `Block IngressRules`.
        """
        return pulumi.get(self, "ingress_rules")

    @ingress_rules.setter
    def ingress_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TrafficMirrorFilterIngressRuleArgs']]]]):
        pulumi.set(self, "ingress_rules", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group to which the VPC belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

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
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tags of this resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="trafficMirrorFilterDescription")
    def traffic_mirror_filter_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the TrafficMirrorFilter.
        """
        return pulumi.get(self, "traffic_mirror_filter_description")

    @traffic_mirror_filter_description.setter
    def traffic_mirror_filter_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_filter_description", value)

    @property
    @pulumi.getter(name="trafficMirrorFilterName")
    def traffic_mirror_filter_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the TrafficMirrorFilter.
        """
        return pulumi.get(self, "traffic_mirror_filter_name")

    @traffic_mirror_filter_name.setter
    def traffic_mirror_filter_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_filter_name", value)


class TrafficMirrorFilter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 egress_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterEgressRuleArgs']]]]] = None,
                 ingress_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterIngressRuleArgs']]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 traffic_mirror_filter_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_filter_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a VPC Traffic Mirror Filter resource. Traffic mirror filter criteria.

        For information about VPC Traffic Mirror Filter and how to use it, see [What is Traffic Mirror Filter](https://www.alibabacloud.com/help/doc-detail/207513.htm).

        > **NOTE:** Available in v1.140.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default3i_xhoa = alicloud.resourcemanager.ResourceGroup("default3iXhoa",
            display_name="testname03",
            resource_group_name=name)
        defaultd_nz2qk = alicloud.resourcemanager.ResourceGroup("defaultdNz2qk",
            display_name="testname04",
            resource_group_name=f"{name}1")
        default = alicloud.vpc.TrafficMirrorFilter("default",
            traffic_mirror_filter_description="test",
            traffic_mirror_filter_name=name,
            resource_group_id=default3i_xhoa.id,
            egress_rules=[alicloud.vpc.TrafficMirrorFilterEgressRuleArgs(
                priority=1,
                protocol="TCP",
                action="accept",
                destination_cidr_block="32.0.0.0/4",
                destination_port_range="80/80",
                source_cidr_block="16.0.0.0/4",
                source_port_range="80/80",
            )],
            ingress_rules=[alicloud.vpc.TrafficMirrorFilterIngressRuleArgs(
                priority=1,
                protocol="TCP",
                action="accept",
                destination_cidr_block="10.64.0.0/10",
                destination_port_range="80/80",
                source_cidr_block="10.0.0.0/8",
                source_port_range="80/80",
            )])
        ```

        ## Import

        VPC Traffic Mirror Filter can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck only this request. Value:
               - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
               - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterEgressRuleArgs']]]] egress_rules: Information about the outbound rule. See the following `Block EgressRules`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterIngressRuleArgs']]]] ingress_rules: Inward direction rule information. See the following `Block IngressRules`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the VPC belongs.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of this resource.
        :param pulumi.Input[str] traffic_mirror_filter_description: The description of the TrafficMirrorFilter.
        :param pulumi.Input[str] traffic_mirror_filter_name: The name of the TrafficMirrorFilter.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TrafficMirrorFilterArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC Traffic Mirror Filter resource. Traffic mirror filter criteria.

        For information about VPC Traffic Mirror Filter and how to use it, see [What is Traffic Mirror Filter](https://www.alibabacloud.com/help/doc-detail/207513.htm).

        > **NOTE:** Available in v1.140.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default3i_xhoa = alicloud.resourcemanager.ResourceGroup("default3iXhoa",
            display_name="testname03",
            resource_group_name=name)
        defaultd_nz2qk = alicloud.resourcemanager.ResourceGroup("defaultdNz2qk",
            display_name="testname04",
            resource_group_name=f"{name}1")
        default = alicloud.vpc.TrafficMirrorFilter("default",
            traffic_mirror_filter_description="test",
            traffic_mirror_filter_name=name,
            resource_group_id=default3i_xhoa.id,
            egress_rules=[alicloud.vpc.TrafficMirrorFilterEgressRuleArgs(
                priority=1,
                protocol="TCP",
                action="accept",
                destination_cidr_block="32.0.0.0/4",
                destination_port_range="80/80",
                source_cidr_block="16.0.0.0/4",
                source_port_range="80/80",
            )],
            ingress_rules=[alicloud.vpc.TrafficMirrorFilterIngressRuleArgs(
                priority=1,
                protocol="TCP",
                action="accept",
                destination_cidr_block="10.64.0.0/10",
                destination_port_range="80/80",
                source_cidr_block="10.0.0.0/8",
                source_port_range="80/80",
            )])
        ```

        ## Import

        VPC Traffic Mirror Filter can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter example <id>
        ```

        :param str resource_name: The name of the resource.
        :param TrafficMirrorFilterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TrafficMirrorFilterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TrafficMirrorFilterArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 egress_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterEgressRuleArgs']]]]] = None,
                 ingress_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterIngressRuleArgs']]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 traffic_mirror_filter_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_filter_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TrafficMirrorFilterArgs.__new__(TrafficMirrorFilterArgs)

            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["egress_rules"] = egress_rules
            __props__.__dict__["ingress_rules"] = ingress_rules
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["traffic_mirror_filter_description"] = traffic_mirror_filter_description
            __props__.__dict__["traffic_mirror_filter_name"] = traffic_mirror_filter_name
            __props__.__dict__["status"] = None
        super(TrafficMirrorFilter, __self__).__init__(
            'alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            egress_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterEgressRuleArgs']]]]] = None,
            ingress_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterIngressRuleArgs']]]]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            traffic_mirror_filter_description: Optional[pulumi.Input[str]] = None,
            traffic_mirror_filter_name: Optional[pulumi.Input[str]] = None) -> 'TrafficMirrorFilter':
        """
        Get an existing TrafficMirrorFilter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck only this request. Value:
               - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
               - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterEgressRuleArgs']]]] egress_rules: Information about the outbound rule. See the following `Block EgressRules`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TrafficMirrorFilterIngressRuleArgs']]]] ingress_rules: Inward direction rule information. See the following `Block IngressRules`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the VPC belongs.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of this resource.
        :param pulumi.Input[str] traffic_mirror_filter_description: The description of the TrafficMirrorFilter.
        :param pulumi.Input[str] traffic_mirror_filter_name: The name of the TrafficMirrorFilter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TrafficMirrorFilterState.__new__(_TrafficMirrorFilterState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["egress_rules"] = egress_rules
        __props__.__dict__["ingress_rules"] = ingress_rules
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["traffic_mirror_filter_description"] = traffic_mirror_filter_description
        __props__.__dict__["traffic_mirror_filter_name"] = traffic_mirror_filter_name
        return TrafficMirrorFilter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to PreCheck only this request. Value:
        - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
        - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="egressRules")
    def egress_rules(self) -> pulumi.Output[Sequence['outputs.TrafficMirrorFilterEgressRule']]:
        """
        Information about the outbound rule. See the following `Block EgressRules`.
        """
        return pulumi.get(self, "egress_rules")

    @property
    @pulumi.getter(name="ingressRules")
    def ingress_rules(self) -> pulumi.Output[Sequence['outputs.TrafficMirrorFilterIngressRule']]:
        """
        Inward direction rule information. See the following `Block IngressRules`.
        """
        return pulumi.get(self, "ingress_rules")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group to which the VPC belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The tags of this resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="trafficMirrorFilterDescription")
    def traffic_mirror_filter_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the TrafficMirrorFilter.
        """
        return pulumi.get(self, "traffic_mirror_filter_description")

    @property
    @pulumi.getter(name="trafficMirrorFilterName")
    def traffic_mirror_filter_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the TrafficMirrorFilter.
        """
        return pulumi.get(self, "traffic_mirror_filter_name")

