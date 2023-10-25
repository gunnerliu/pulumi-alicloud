// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a security group rule resource.
    /// Represents a single `ingress` or `egress` group rule, which can be added to external Security Groups.
    /// 
    /// &gt; **NOTE:**  `nic_type` should set to `intranet` when security group type is `vpc` or specifying the `source_security_group_id`. In this situation it does not distinguish between intranet and internet, the rule is effective on them both.
    /// 
    /// ## Module Support
    /// 
    /// You can use the existing security-group module
    /// to create a security group and add several rules one-click.
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/securityGroupRule:SecurityGroupRule")]
    public partial class SecurityGroupRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
        /// </summary>
        [Output("cidrIp")]
        public Output<string?> CidrIp { get; private set; } = null!;

        /// <summary>
        /// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
        /// </summary>
        [Output("ipProtocol")]
        public Output<string> IpProtocol { get; private set; } = null!;

        /// <summary>
        /// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidr_ip` parameter.
        /// 
        /// &gt; **NOTE:**  You must specify one of the following field: `cidr_ip`,`source_security_group_id`,`prefix_list_id`,`ipv6_cidr_ip`.
        /// </summary>
        [Output("ipv6CidrIp")]
        public Output<string?> Ipv6CidrIp { get; private set; } = null!;

        /// <summary>
        /// Network type, can be either `internet` or `intranet`, the default value is `internet`.
        /// </summary>
        [Output("nicType")]
        public Output<string> NicType { get; private set; } = null!;

        /// <summary>
        /// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
        /// </summary>
        [Output("policy")]
        public Output<string?> Policy { get; private set; } = null!;

        /// <summary>
        /// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
        /// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
        /// </summary>
        [Output("portRange")]
        public Output<string?> PortRange { get; private set; } = null!;

        /// <summary>
        /// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidr_ip`,`source_security_group_id`,`ipv6_cidr_ip` parameter, this parameter is ignored.
        /// </summary>
        [Output("prefixListId")]
        public Output<string> PrefixListId { get; private set; } = null!;

        /// <summary>
        /// Authorization policy priority, with parameter values: `1-100`, default value: 1.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// The security group to apply this rule to.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
        /// </summary>
        [Output("sourceGroupOwnerAccount")]
        public Output<string?> SourceGroupOwnerAccount { get; private set; } = null!;

        /// <summary>
        /// The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
        /// </summary>
        [Output("sourceSecurityGroupId")]
        public Output<string?> SourceSecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityGroupRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityGroupRule(string name, SecurityGroupRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/securityGroupRule:SecurityGroupRule", name, args ?? new SecurityGroupRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityGroupRule(string name, Input<string> id, SecurityGroupRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/securityGroupRule:SecurityGroupRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecurityGroupRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityGroupRule Get(string name, Input<string> id, SecurityGroupRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityGroupRule(name, id, state, options);
        }
    }

    public sealed class SecurityGroupRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
        /// </summary>
        [Input("cidrIp")]
        public Input<string>? CidrIp { get; set; }

        /// <summary>
        /// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
        /// </summary>
        [Input("ipProtocol", required: true)]
        public Input<string> IpProtocol { get; set; } = null!;

        /// <summary>
        /// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidr_ip` parameter.
        /// 
        /// &gt; **NOTE:**  You must specify one of the following field: `cidr_ip`,`source_security_group_id`,`prefix_list_id`,`ipv6_cidr_ip`.
        /// </summary>
        [Input("ipv6CidrIp")]
        public Input<string>? Ipv6CidrIp { get; set; }

        /// <summary>
        /// Network type, can be either `internet` or `intranet`, the default value is `internet`.
        /// </summary>
        [Input("nicType")]
        public Input<string>? NicType { get; set; }

        /// <summary>
        /// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
        /// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
        /// </summary>
        [Input("portRange")]
        public Input<string>? PortRange { get; set; }

        /// <summary>
        /// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidr_ip`,`source_security_group_id`,`ipv6_cidr_ip` parameter, this parameter is ignored.
        /// </summary>
        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        /// <summary>
        /// Authorization policy priority, with parameter values: `1-100`, default value: 1.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The security group to apply this rule to.
        /// </summary>
        [Input("securityGroupId", required: true)]
        public Input<string> SecurityGroupId { get; set; } = null!;

        /// <summary>
        /// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
        /// </summary>
        [Input("sourceGroupOwnerAccount")]
        public Input<string>? SourceGroupOwnerAccount { get; set; }

        /// <summary>
        /// The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
        /// </summary>
        [Input("sourceSecurityGroupId")]
        public Input<string>? SourceSecurityGroupId { get; set; }

        /// <summary>
        /// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public SecurityGroupRuleArgs()
        {
        }
        public static new SecurityGroupRuleArgs Empty => new SecurityGroupRuleArgs();
    }

    public sealed class SecurityGroupRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
        /// </summary>
        [Input("cidrIp")]
        public Input<string>? CidrIp { get; set; }

        /// <summary>
        /// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
        /// </summary>
        [Input("ipProtocol")]
        public Input<string>? IpProtocol { get; set; }

        /// <summary>
        /// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidr_ip` parameter.
        /// 
        /// &gt; **NOTE:**  You must specify one of the following field: `cidr_ip`,`source_security_group_id`,`prefix_list_id`,`ipv6_cidr_ip`.
        /// </summary>
        [Input("ipv6CidrIp")]
        public Input<string>? Ipv6CidrIp { get; set; }

        /// <summary>
        /// Network type, can be either `internet` or `intranet`, the default value is `internet`.
        /// </summary>
        [Input("nicType")]
        public Input<string>? NicType { get; set; }

        /// <summary>
        /// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
        /// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
        /// </summary>
        [Input("portRange")]
        public Input<string>? PortRange { get; set; }

        /// <summary>
        /// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidr_ip`,`source_security_group_id`,`ipv6_cidr_ip` parameter, this parameter is ignored.
        /// </summary>
        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        /// <summary>
        /// Authorization policy priority, with parameter values: `1-100`, default value: 1.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The security group to apply this rule to.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
        /// </summary>
        [Input("sourceGroupOwnerAccount")]
        public Input<string>? SourceGroupOwnerAccount { get; set; }

        /// <summary>
        /// The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
        /// </summary>
        [Input("sourceSecurityGroupId")]
        public Input<string>? SourceSecurityGroupId { get; set; }

        /// <summary>
        /// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public SecurityGroupRuleState()
        {
        }
        public static new SecurityGroupRuleState Empty => new SecurityGroupRuleState();
    }
}
