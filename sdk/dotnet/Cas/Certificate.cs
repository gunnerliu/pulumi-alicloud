// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cas
{
    /// <summary>
    /// &gt; **DEPRECATED:**  This datasource has been deprecated from version `1.129.0`. Please use new datasource alicloud_ssl_certificates_service_certificate.
    /// 
    /// Provides a CAS Certificate resource.
    /// 
    /// &gt; **NOTE:** The Certificate name which you want to add must be already registered and had not added by another account. Every Certificate name can only exist in a unique group.
    /// 
    /// &gt; **NOTE:** The Cas Certificate region only support cn-hangzhou, ap-south-1, me-east-1, eu-central-1, ap-northeast-1, ap-southeast-2.
    /// 
    /// &gt; **NOTE:** Available in 1.35.0+ .
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Add a new Certificate.
    ///     var cert = new AliCloud.Cas.Certificate("cert", new()
    ///     {
    ///         Cert = File.ReadAllText($"{path.Module}/test.crt"),
    ///         Key = File.ReadAllText($"{path.Module}/test.key"),
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [Obsolete(@"This resource has been deprecated in favour of ServiceCertificate")]
    [AliCloudResourceType("alicloud:cas/certificate:Certificate")]
    public partial class Certificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Cert of the Certificate in which the Certificate will add.
        /// </summary>
        [Output("cert")]
        public Output<string> Cert { get; private set; } = null!;

        [Output("certificateName")]
        public Output<string> CertificateName { get; private set; } = null!;

        /// <summary>
        /// Key of the Certificate in which the Certificate will add.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// Name of the Certificate. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Certificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Certificate(string name, CertificateArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cas/certificate:Certificate", name, args ?? new CertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Certificate(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cas/certificate:Certificate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Certificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Certificate Get(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new Certificate(name, id, state, options);
        }
    }

    public sealed class CertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cert of the Certificate in which the Certificate will add.
        /// </summary>
        [Input("cert", required: true)]
        public Input<string> Cert { get; set; } = null!;

        [Input("certificateName")]
        public Input<string>? CertificateName { get; set; }

        /// <summary>
        /// Key of the Certificate in which the Certificate will add.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// Name of the Certificate. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CertificateArgs()
        {
        }
        public static new CertificateArgs Empty => new CertificateArgs();
    }

    public sealed class CertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cert of the Certificate in which the Certificate will add.
        /// </summary>
        [Input("cert")]
        public Input<string>? Cert { get; set; }

        [Input("certificateName")]
        public Input<string>? CertificateName { get; set; }

        /// <summary>
        /// Key of the Certificate in which the Certificate will add.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// Name of the Certificate. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CertificateState()
        {
        }
        public static new CertificateState Empty => new CertificateState();
    }
}
