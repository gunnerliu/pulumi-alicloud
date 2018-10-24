# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class ScalingGroup(pulumi.CustomResource):
    """
    Provides a ESS scaling group resource which is a collection of ECS instances with the same application scenarios.
    
    It defines the maximum and minimum numbers of ECS instances in the group, and their associated Server Load Balancer instances, RDS instances, and other attributes.
    
    ~> **NOTE:** You can launch an ESS scaling group for a VPC network via specifying parameter `vswitch_ids`.
    """
    def __init__(__self__, __name__, __opts__=None, db_instance_ids=None, default_cooldown=None, loadbalancer_ids=None, max_size=None, min_size=None, multi_az_policy=None, removal_policies=None, scaling_group_name=None, vswitch_id=None, vswitch_ids=None):
        """Create a ScalingGroup resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if db_instance_ids and not isinstance(db_instance_ids, list):
            raise TypeError('Expected property db_instance_ids to be a list')
        __self__.db_instance_ids = db_instance_ids
        """
        If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
        - The specified RDS instance must be in running status.
        - The specified RDS instance’s whitelist must have room for more IP addresses.
        """
        __props__['dbInstanceIds'] = db_instance_ids

        if default_cooldown and not isinstance(default_cooldown, int):
            raise TypeError('Expected property default_cooldown to be a int')
        __self__.default_cooldown = default_cooldown
        """
        Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
        """
        __props__['defaultCooldown'] = default_cooldown

        if loadbalancer_ids and not isinstance(loadbalancer_ids, list):
            raise TypeError('Expected property loadbalancer_ids to be a list')
        __self__.loadbalancer_ids = loadbalancer_ids
        """
        If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
        - The Server Load Balancer instance must be enabled.
        - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
        targeting your `alicloud_slb_listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
        - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
        - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
        """
        __props__['loadbalancerIds'] = loadbalancer_ids

        if not max_size:
            raise TypeError('Missing required property max_size')
        elif not isinstance(max_size, int):
            raise TypeError('Expected property max_size to be a int')
        __self__.max_size = max_size
        """
        Maximum number of ECS instances in the scaling group. Value range: [0, 100].
        """
        __props__['maxSize'] = max_size

        if not min_size:
            raise TypeError('Missing required property min_size')
        elif not isinstance(min_size, int):
            raise TypeError('Expected property min_size to be a int')
        __self__.min_size = min_size
        """
        Minimum number of ECS instances in the scaling group. Value range: [0, 100].
        """
        __props__['minSize'] = min_size

        if multi_az_policy and not isinstance(multi_az_policy, basestring):
            raise TypeError('Expected property multi_az_policy to be a basestring')
        __self__.multi_az_policy = multi_az_policy
        """
        Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY or BALANCE.
        """
        __props__['multiAzPolicy'] = multi_az_policy

        if removal_policies and not isinstance(removal_policies, list):
            raise TypeError('Expected property removal_policies to be a list')
        __self__.removal_policies = removal_policies
        """
        RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
        - OldestInstance: removes the first ECS instance attached to the scaling group.
        - NewestInstance: removes the first ECS instance attached to the scaling group.
        - OldestScalingConfiguration: removes the ECS instance with the oldest scaling configuration.
        - Default values: OldestScalingConfiguration and OldestInstance. You can enter up to two removal policies.
        """
        __props__['removalPolicies'] = removal_policies

        if scaling_group_name and not isinstance(scaling_group_name, basestring):
            raise TypeError('Expected property scaling_group_name to be a basestring')
        __self__.scaling_group_name = scaling_group_name
        """
        Name shown for the scaling group, which must contain 2-40 characters (English or Chinese). If this parameter is not specified, the default value is ScalingGroupId.
        """
        __props__['scalingGroupName'] = scaling_group_name

        if vswitch_id and not isinstance(vswitch_id, basestring):
            raise TypeError('Expected property vswitch_id to be a basestring')
        __self__.vswitch_id = vswitch_id
        """
        It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
        """
        __props__['vswitchId'] = vswitch_id

        if vswitch_ids and not isinstance(vswitch_ids, list):
            raise TypeError('Expected property vswitch_ids to be a list')
        __self__.vswitch_ids = vswitch_ids
        """
        List of virtual switch IDs in which the ecs instances to be launched.
        """
        __props__['vswitchIds'] = vswitch_ids

        super(ScalingGroup, __self__).__init__(
            'alicloud:ess/scalingGroup:ScalingGroup',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'dbInstanceIds' in outs:
            self.db_instance_ids = outs['dbInstanceIds']
        if 'defaultCooldown' in outs:
            self.default_cooldown = outs['defaultCooldown']
        if 'loadbalancerIds' in outs:
            self.loadbalancer_ids = outs['loadbalancerIds']
        if 'maxSize' in outs:
            self.max_size = outs['maxSize']
        if 'minSize' in outs:
            self.min_size = outs['minSize']
        if 'multiAzPolicy' in outs:
            self.multi_az_policy = outs['multiAzPolicy']
        if 'removalPolicies' in outs:
            self.removal_policies = outs['removalPolicies']
        if 'scalingGroupName' in outs:
            self.scaling_group_name = outs['scalingGroupName']
        if 'vswitchId' in outs:
            self.vswitch_id = outs['vswitchId']
        if 'vswitchIds' in outs:
            self.vswitch_ids = outs['vswitchIds']