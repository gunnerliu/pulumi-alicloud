// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos
{
    /// <summary>
    /// Provides a Anti-DDoS Pro Domain Resource resource.
    /// 
    /// For information about Anti-DDoS Pro Domain Resource and how to use it, see [What is Domain Resource](https://www.alibabacloud.com/help/en/ddos-protection/latest/api-ddoscoo-2020-01-01-createwebrule).
    /// 
    /// &gt; **NOTE:** Available since v1.123.0.
    /// 
    /// ## Import
    /// 
    /// Anti-DDoS Pro Domain Resource can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ddos/domainResource:DomainResource example &lt;domain&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ddos/domainResource:DomainResource")]
    public partial class DomainResource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Available since v1.207.2) The CNAME assigned to the domain name.
        /// </summary>
        [Output("cname")]
        public Output<string> Cname { get; private set; } = null!;

        /// <summary>
        /// The domain name of the website that you want to add to the instance.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The advanced HTTPS settings. This parameter takes effect only when the value of ProxyType includes https. This parameter is a string that contains a JSON struct. The JSON struct includes the following fields:
        /// </summary>
        [Output("httpsExt")]
        public Output<string> HttpsExt { get; private set; } = null!;

        /// <summary>
        /// A list of instance ID that you want to associate. If this parameter is empty, only the domain name of the website is added but no instance is associated with the website.
        /// &gt; **NOTE:** There is a potential diff error because of the order of `instance_ids` values indefinite. So, from version 1.161.0, `instance_ids` type has been updated as `set` from `list`, and you can use tolist to convert it to a list.
        /// </summary>
        [Output("instanceIds")]
        public Output<ImmutableArray<string>> InstanceIds { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable the OCSP feature. Default value: `false`. Valid values:
        /// </summary>
        [Output("ocspEnabled")]
        public Output<bool?> OcspEnabled { get; private set; } = null!;

        /// <summary>
        /// Protocol type and port number information. See `proxy_types` below.
        /// &gt; **NOTE:** From version 1.206.0, `proxy_types` can be modified.
        /// </summary>
        [Output("proxyTypes")]
        public Output<ImmutableArray<Outputs.DomainResourceProxyType>> ProxyTypes { get; private set; } = null!;

        /// <summary>
        /// the IP address. This field is required and must be a string array.
        /// </summary>
        [Output("realServers")]
        public Output<ImmutableArray<string>> RealServers { get; private set; } = null!;

        /// <summary>
        /// The address type of the origin server. Use the domain name of the origin server if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the Anti-DDoS Pro or Anti-DDoS Premium instance. If you use the domain name, you must enter the address of the proxy, such as the CNAME of WAF. Valid values:
        /// </summary>
        [Output("rsType")]
        public Output<int> RsType { get; private set; } = null!;


        /// <summary>
        /// Create a DomainResource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainResource(string name, DomainResourceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ddos/domainResource:DomainResource", name, args ?? new DomainResourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainResource(string name, Input<string> id, DomainResourceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ddos/domainResource:DomainResource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DomainResource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainResource Get(string name, Input<string> id, DomainResourceState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainResource(name, id, state, options);
        }
    }

    public sealed class DomainResourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain name of the website that you want to add to the instance.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The advanced HTTPS settings. This parameter takes effect only when the value of ProxyType includes https. This parameter is a string that contains a JSON struct. The JSON struct includes the following fields:
        /// </summary>
        [Input("httpsExt")]
        public Input<string>? HttpsExt { get; set; }

        [Input("instanceIds", required: true)]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// A list of instance ID that you want to associate. If this parameter is empty, only the domain name of the website is added but no instance is associated with the website.
        /// &gt; **NOTE:** There is a potential diff error because of the order of `instance_ids` values indefinite. So, from version 1.161.0, `instance_ids` type has been updated as `set` from `list`, and you can use tolist to convert it to a list.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// Specifies whether to enable the OCSP feature. Default value: `false`. Valid values:
        /// </summary>
        [Input("ocspEnabled")]
        public Input<bool>? OcspEnabled { get; set; }

        [Input("proxyTypes", required: true)]
        private InputList<Inputs.DomainResourceProxyTypeArgs>? _proxyTypes;

        /// <summary>
        /// Protocol type and port number information. See `proxy_types` below.
        /// &gt; **NOTE:** From version 1.206.0, `proxy_types` can be modified.
        /// </summary>
        public InputList<Inputs.DomainResourceProxyTypeArgs> ProxyTypes
        {
            get => _proxyTypes ?? (_proxyTypes = new InputList<Inputs.DomainResourceProxyTypeArgs>());
            set => _proxyTypes = value;
        }

        [Input("realServers", required: true)]
        private InputList<string>? _realServers;

        /// <summary>
        /// the IP address. This field is required and must be a string array.
        /// </summary>
        public InputList<string> RealServers
        {
            get => _realServers ?? (_realServers = new InputList<string>());
            set => _realServers = value;
        }

        /// <summary>
        /// The address type of the origin server. Use the domain name of the origin server if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the Anti-DDoS Pro or Anti-DDoS Premium instance. If you use the domain name, you must enter the address of the proxy, such as the CNAME of WAF. Valid values:
        /// </summary>
        [Input("rsType", required: true)]
        public Input<int> RsType { get; set; } = null!;

        public DomainResourceArgs()
        {
        }
        public static new DomainResourceArgs Empty => new DomainResourceArgs();
    }

    public sealed class DomainResourceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Available since v1.207.2) The CNAME assigned to the domain name.
        /// </summary>
        [Input("cname")]
        public Input<string>? Cname { get; set; }

        /// <summary>
        /// The domain name of the website that you want to add to the instance.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The advanced HTTPS settings. This parameter takes effect only when the value of ProxyType includes https. This parameter is a string that contains a JSON struct. The JSON struct includes the following fields:
        /// </summary>
        [Input("httpsExt")]
        public Input<string>? HttpsExt { get; set; }

        [Input("instanceIds")]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// A list of instance ID that you want to associate. If this parameter is empty, only the domain name of the website is added but no instance is associated with the website.
        /// &gt; **NOTE:** There is a potential diff error because of the order of `instance_ids` values indefinite. So, from version 1.161.0, `instance_ids` type has been updated as `set` from `list`, and you can use tolist to convert it to a list.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// Specifies whether to enable the OCSP feature. Default value: `false`. Valid values:
        /// </summary>
        [Input("ocspEnabled")]
        public Input<bool>? OcspEnabled { get; set; }

        [Input("proxyTypes")]
        private InputList<Inputs.DomainResourceProxyTypeGetArgs>? _proxyTypes;

        /// <summary>
        /// Protocol type and port number information. See `proxy_types` below.
        /// &gt; **NOTE:** From version 1.206.0, `proxy_types` can be modified.
        /// </summary>
        public InputList<Inputs.DomainResourceProxyTypeGetArgs> ProxyTypes
        {
            get => _proxyTypes ?? (_proxyTypes = new InputList<Inputs.DomainResourceProxyTypeGetArgs>());
            set => _proxyTypes = value;
        }

        [Input("realServers")]
        private InputList<string>? _realServers;

        /// <summary>
        /// the IP address. This field is required and must be a string array.
        /// </summary>
        public InputList<string> RealServers
        {
            get => _realServers ?? (_realServers = new InputList<string>());
            set => _realServers = value;
        }

        /// <summary>
        /// The address type of the origin server. Use the domain name of the origin server if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the Anti-DDoS Pro or Anti-DDoS Premium instance. If you use the domain name, you must enter the address of the proxy, such as the CNAME of WAF. Valid values:
        /// </summary>
        [Input("rsType")]
        public Input<int>? RsType { get; set; }

        public DomainResourceState()
        {
        }
        public static new DomainResourceState Empty => new DomainResourceState();
    }
}
