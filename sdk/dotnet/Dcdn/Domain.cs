// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn
{
    /// <summary>
    /// You can use DCDN to improve the overall performance of your website and accelerate content delivery to improve user experience. For information about Alicloud DCDN Domain and how to use it, see [What is Resource Alicloud DCDN Domain](https://www.alibabacloud.com/help/en/doc-detail/130628.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.94.0+.
    /// 
    /// &gt; **NOTE:** You must activate the Dynamic Route for CDN (DCDN) service before you create an accelerated domain.
    /// 
    /// &gt; **NOTE:** Make sure that you have obtained an Internet content provider (ICP) filling for the accelerated domain.
    /// 
    /// &gt; **NOTE:** If the origin content is not saved on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be completed by the next working day after you submit the application.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Dcdn.Domain("example", new()
    ///     {
    ///         DomainName = "example.com",
    ///         Scope = "overseas",
    ///         Sources = new[]
    ///         {
    ///             new AliCloud.Dcdn.Inputs.DomainSourceArgs
    ///             {
    ///                 Content = "1.1.1.1",
    ///                 Port = 80,
    ///                 Priority = "20",
    ///                 Type = "ipaddr",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DCDN Domain can be imported using the id or DCDN Domain name, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:dcdn/domain:Domain example example.com
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dcdn/domain:Domain")]
    public partial class Domain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates the name of the certificate if the HTTPS protocol is enabled.
        /// </summary>
        [Output("certName")]
        public Output<string> CertName { get; private set; } = null!;

        /// <summary>
        /// The type of the certificate. Valid values:
        /// `free`: a free certificate.
        /// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
        /// `upload`: a user uploaded certificate.
        /// </summary>
        [Output("certType")]
        public Output<string?> CertType { get; private set; } = null!;

        /// <summary>
        /// The URL that is used to test the accessibility of the origin.
        /// </summary>
        [Output("checkUrl")]
        public Output<string?> CheckUrl { get; private set; } = null!;

        /// <summary>
        /// The name of the accelerated domain.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
        /// </summary>
        [Output("forceSet")]
        public Output<string?> ForceSet { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The acceleration region.
        /// </summary>
        [Output("scope")]
        public Output<string?> Scope { get; private set; } = null!;

        /// <summary>
        /// The top-level domain name.
        /// </summary>
        [Output("securityToken")]
        public Output<string?> SecurityToken { get; private set; } = null!;

        /// <summary>
        /// The origin information.
        /// </summary>
        [Output("sources")]
        public Output<ImmutableArray<Outputs.DomainSource>> Sources { get; private set; } = null!;

        /// <summary>
        /// The private key. Specify this parameter only if you enable the SSL certificate.
        /// </summary>
        [Output("sslPri")]
        public Output<string?> SslPri { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
        /// </summary>
        [Output("sslProtocol")]
        public Output<string?> SslProtocol { get; private set; } = null!;

        /// <summary>
        /// Indicates the public key of the certificate if the HTTPS protocol is enabled.
        /// </summary>
        [Output("sslPub")]
        public Output<string?> SslPub { get; private set; } = null!;

        /// <summary>
        /// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// The top-level domain name.
        /// </summary>
        [Output("topLevelDomain")]
        public Output<string?> TopLevelDomain { get; private set; } = null!;


        /// <summary>
        /// Create a Domain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Domain(string name, DomainArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/domain:Domain", name, args ?? new DomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Domain(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/domain:Domain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Domain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Domain Get(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
        {
            return new Domain(name, id, state, options);
        }
    }

    public sealed class DomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the name of the certificate if the HTTPS protocol is enabled.
        /// </summary>
        [Input("certName")]
        public Input<string>? CertName { get; set; }

        /// <summary>
        /// The type of the certificate. Valid values:
        /// `free`: a free certificate.
        /// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
        /// `upload`: a user uploaded certificate.
        /// </summary>
        [Input("certType")]
        public Input<string>? CertType { get; set; }

        /// <summary>
        /// The URL that is used to test the accessibility of the origin.
        /// </summary>
        [Input("checkUrl")]
        public Input<string>? CheckUrl { get; set; }

        /// <summary>
        /// The name of the accelerated domain.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
        /// </summary>
        [Input("forceSet")]
        public Input<string>? ForceSet { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The acceleration region.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The top-level domain name.
        /// </summary>
        [Input("securityToken")]
        public Input<string>? SecurityToken { get; set; }

        [Input("sources", required: true)]
        private InputList<Inputs.DomainSourceArgs>? _sources;

        /// <summary>
        /// The origin information.
        /// </summary>
        public InputList<Inputs.DomainSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.DomainSourceArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// The private key. Specify this parameter only if you enable the SSL certificate.
        /// </summary>
        [Input("sslPri")]
        public Input<string>? SslPri { get; set; }

        /// <summary>
        /// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
        /// </summary>
        [Input("sslProtocol")]
        public Input<string>? SslProtocol { get; set; }

        /// <summary>
        /// Indicates the public key of the certificate if the HTTPS protocol is enabled.
        /// </summary>
        [Input("sslPub")]
        public Input<string>? SslPub { get; set; }

        /// <summary>
        /// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The top-level domain name.
        /// </summary>
        [Input("topLevelDomain")]
        public Input<string>? TopLevelDomain { get; set; }

        public DomainArgs()
        {
        }
        public static new DomainArgs Empty => new DomainArgs();
    }

    public sealed class DomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the name of the certificate if the HTTPS protocol is enabled.
        /// </summary>
        [Input("certName")]
        public Input<string>? CertName { get; set; }

        /// <summary>
        /// The type of the certificate. Valid values:
        /// `free`: a free certificate.
        /// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
        /// `upload`: a user uploaded certificate.
        /// </summary>
        [Input("certType")]
        public Input<string>? CertType { get; set; }

        /// <summary>
        /// The URL that is used to test the accessibility of the origin.
        /// </summary>
        [Input("checkUrl")]
        public Input<string>? CheckUrl { get; set; }

        /// <summary>
        /// The name of the accelerated domain.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
        /// </summary>
        [Input("forceSet")]
        public Input<string>? ForceSet { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The acceleration region.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The top-level domain name.
        /// </summary>
        [Input("securityToken")]
        public Input<string>? SecurityToken { get; set; }

        [Input("sources")]
        private InputList<Inputs.DomainSourceGetArgs>? _sources;

        /// <summary>
        /// The origin information.
        /// </summary>
        public InputList<Inputs.DomainSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.DomainSourceGetArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// The private key. Specify this parameter only if you enable the SSL certificate.
        /// </summary>
        [Input("sslPri")]
        public Input<string>? SslPri { get; set; }

        /// <summary>
        /// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
        /// </summary>
        [Input("sslProtocol")]
        public Input<string>? SslProtocol { get; set; }

        /// <summary>
        /// Indicates the public key of the certificate if the HTTPS protocol is enabled.
        /// </summary>
        [Input("sslPub")]
        public Input<string>? SslPub { get; set; }

        /// <summary>
        /// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The top-level domain name.
        /// </summary>
        [Input("topLevelDomain")]
        public Input<string>? TopLevelDomain { get; set; }

        public DomainState()
        {
        }
        public static new DomainState Empty => new DomainState();
    }
}
