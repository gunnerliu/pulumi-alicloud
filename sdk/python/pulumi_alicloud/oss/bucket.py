# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Bucket(pulumi.CustomResource):
    acl: pulumi.Output[str]
    """
    The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be "private", "public-read" and "public-read-write". Defaults to "private".
    """
    bucket: pulumi.Output[str]
    cors_rules: pulumi.Output[list]
    """
    A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.

      * `allowedHeaders` (`list`) - Specifies which headers are allowed.
      * `allowedMethods` (`list`) - Specifies which methods are allowed. Can be GET, PUT, POST, DELETE or HEAD.
      * `allowedOrigins` (`list`) - Specifies which origins are allowed.
      * `exposeHeaders` (`list`) - Specifies expose header in the response.
      * `maxAgeSeconds` (`float`) - Specifies time in seconds that browser can cache the response for a preflight request.
    """
    creation_date: pulumi.Output[str]
    """
    The creation date of the bucket.
    """
    extranet_endpoint: pulumi.Output[str]
    """
    The extranet access endpoint of the bucket.
    """
    force_destroy: pulumi.Output[bool]
    """
    A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to "false".
    """
    intranet_endpoint: pulumi.Output[str]
    """
    The intranet access endpoint of the bucket.
    """
    lifecycle_rules: pulumi.Output[list]
    """
    A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).

      * `enabled` (`bool`) - Specifies lifecycle rule status.
      * `expirations` (`list`) - Specifies a period in the object's expire (documented below).
        * `date` (`str`) - Specifies the date after which you want the corresponding action to take effect. The value obeys ISO8601 format like `2017-03-09`.
        * `days` (`float`) - Specifies the number of days after object creation when the specific rule action takes effect.

      * `id` (`str`) - Unique identifier for the rule. If omitted, OSS bucket will assign a unique name.
      * `prefix` (`str`) - Object key prefix identifying one or more objects to which the rule applies. Default value is null, the rule applies to all objects in a bucket.
      * `transitions` (`list`) - Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. (documented below).
        * `createdBeforeDate` (`str`) - Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that objects updated before 2002-10-11T00:00:00.000Z are deleted or converted to another storage class, and objects updated after this time (including this time) are not deleted or converted.
        * `days` (`float`) - Specifies the number of days after object creation when the specific rule action takes effect.
        * `storage_class` (`str`) - Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 
    """
    location: pulumi.Output[str]
    """
    The location of the bucket.
    """
    logging: pulumi.Output[dict]
    """
    A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).

      * `targetBucket` (`str`) - The name of the bucket that will receive the log objects.
      * `targetPrefix` (`str`) - To specify a key prefix for log objects.
    """
    logging_isenable: pulumi.Output[bool]
    """
    The flag of using logging enable container. Defaults true.
    """
    owner: pulumi.Output[str]
    """
    The bucket owner.
    """
    policy: pulumi.Output[str]
    """
    Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
    """
    redundancy_type: pulumi.Output[str]
    """
    The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be "LRS", and "ZRS". Defaults to "LRS".
    """
    referer_config: pulumi.Output[dict]
    """
    The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).

      * `allowEmpty` (`bool`) - Allows referer to be empty. Defaults false.
      * `referers` (`list`) - The list of referer.
    """
    server_side_encryption_rule: pulumi.Output[dict]
    """
    A configuration of server-side encryption (documented below).

      * `kmsMasterKeyId` (`str`) - The alibaba cloud KMS master key ID used for the SSE-KMS encryption. 
      * `sseAlgorithm` (`str`) - The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.
    """
    storage_class: pulumi.Output[str]
    """
    Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 
    """
    tags: pulumi.Output[dict]
    """
    A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
    """
    versioning: pulumi.Output[dict]
    """
    A state of versioning (documented below).

      * `status` (`str`) - Specifies the versioning state of a bucket. Valid values: `Enabled` and `Suspended`.
    """
    website: pulumi.Output[dict]
    """
    A website object(documented below).

      * `errorDocument` (`str`) - An absolute path to the document to return in case of a 4XX error.
      * `indexDocument` (`str`) - Alicloud OSS returns this index document when requests are made to the root domain or any of the subfolders.
    """
    def __init__(__self__, resource_name, opts=None, acl=None, bucket=None, cors_rules=None, force_destroy=None, lifecycle_rules=None, logging=None, logging_isenable=None, policy=None, redundancy_type=None, referer_config=None, server_side_encryption_rule=None, storage_class=None, tags=None, versioning=None, website=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a resource to create a oss bucket and set its attribution.

        > **NOTE:** The bucket namespace is shared by all users of the OSS system. Please set bucket name as unique as possible.


        ## Example Usage



        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        bucket_acl = alicloud.oss.Bucket("bucket-acl",
            acl="private",
            bucket="bucket-170309-acl")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be "private", "public-read" and "public-read-write". Defaults to "private".
        :param pulumi.Input[list] cors_rules: A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to "false".
        :param pulumi.Input[list] lifecycle_rules: A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
        :param pulumi.Input[dict] logging: A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
        :param pulumi.Input[bool] logging_isenable: The flag of using logging enable container. Defaults true.
        :param pulumi.Input[str] policy: Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
        :param pulumi.Input[str] redundancy_type: The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be "LRS", and "ZRS". Defaults to "LRS".
        :param pulumi.Input[dict] referer_config: The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
        :param pulumi.Input[dict] server_side_encryption_rule: A configuration of server-side encryption (documented below).
        :param pulumi.Input[str] storage_class: Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
        :param pulumi.Input[dict] versioning: A state of versioning (documented below).
        :param pulumi.Input[dict] website: A website object(documented below).

        The **cors_rules** object supports the following:

          * `allowedHeaders` (`pulumi.Input[list]`) - Specifies which headers are allowed.
          * `allowedMethods` (`pulumi.Input[list]`) - Specifies which methods are allowed. Can be GET, PUT, POST, DELETE or HEAD.
          * `allowedOrigins` (`pulumi.Input[list]`) - Specifies which origins are allowed.
          * `exposeHeaders` (`pulumi.Input[list]`) - Specifies expose header in the response.
          * `maxAgeSeconds` (`pulumi.Input[float]`) - Specifies time in seconds that browser can cache the response for a preflight request.

        The **lifecycle_rules** object supports the following:

          * `enabled` (`pulumi.Input[bool]`) - Specifies lifecycle rule status.
          * `expirations` (`pulumi.Input[list]`) - Specifies a period in the object's expire (documented below).
            * `date` (`pulumi.Input[str]`) - Specifies the date after which you want the corresponding action to take effect. The value obeys ISO8601 format like `2017-03-09`.
            * `days` (`pulumi.Input[float]`) - Specifies the number of days after object creation when the specific rule action takes effect.

          * `id` (`pulumi.Input[str]`) - Unique identifier for the rule. If omitted, OSS bucket will assign a unique name.
          * `prefix` (`pulumi.Input[str]`) - Object key prefix identifying one or more objects to which the rule applies. Default value is null, the rule applies to all objects in a bucket.
          * `transitions` (`pulumi.Input[list]`) - Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. (documented below).
            * `createdBeforeDate` (`pulumi.Input[str]`) - Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that objects updated before 2002-10-11T00:00:00.000Z are deleted or converted to another storage class, and objects updated after this time (including this time) are not deleted or converted.
            * `days` (`pulumi.Input[float]`) - Specifies the number of days after object creation when the specific rule action takes effect.
            * `storage_class` (`pulumi.Input[str]`) - Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 

        The **logging** object supports the following:

          * `targetBucket` (`pulumi.Input[str]`) - The name of the bucket that will receive the log objects.
          * `targetPrefix` (`pulumi.Input[str]`) - To specify a key prefix for log objects.

        The **referer_config** object supports the following:

          * `allowEmpty` (`pulumi.Input[bool]`) - Allows referer to be empty. Defaults false.
          * `referers` (`pulumi.Input[list]`) - The list of referer.

        The **server_side_encryption_rule** object supports the following:

          * `kmsMasterKeyId` (`pulumi.Input[str]`) - The alibaba cloud KMS master key ID used for the SSE-KMS encryption. 
          * `sseAlgorithm` (`pulumi.Input[str]`) - The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.

        The **versioning** object supports the following:

          * `status` (`pulumi.Input[str]`) - Specifies the versioning state of a bucket. Valid values: `Enabled` and `Suspended`.

        The **website** object supports the following:

          * `errorDocument` (`pulumi.Input[str]`) - An absolute path to the document to return in case of a 4XX error.
          * `indexDocument` (`pulumi.Input[str]`) - Alicloud OSS returns this index document when requests are made to the root domain or any of the subfolders.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['acl'] = acl
            __props__['bucket'] = bucket
            __props__['cors_rules'] = cors_rules
            __props__['force_destroy'] = force_destroy
            __props__['lifecycle_rules'] = lifecycle_rules
            __props__['logging'] = logging
            if logging_isenable is not None:
                warnings.warn("Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.", DeprecationWarning)
                pulumi.log.warn("logging_isenable is deprecated: Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.")
            __props__['logging_isenable'] = logging_isenable
            __props__['policy'] = policy
            __props__['redundancy_type'] = redundancy_type
            __props__['referer_config'] = referer_config
            __props__['server_side_encryption_rule'] = server_side_encryption_rule
            __props__['storage_class'] = storage_class
            __props__['tags'] = tags
            __props__['versioning'] = versioning
            __props__['website'] = website
            __props__['creation_date'] = None
            __props__['extranet_endpoint'] = None
            __props__['intranet_endpoint'] = None
            __props__['location'] = None
            __props__['owner'] = None
        super(Bucket, __self__).__init__(
            'alicloud:oss/bucket:Bucket',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, acl=None, bucket=None, cors_rules=None, creation_date=None, extranet_endpoint=None, force_destroy=None, intranet_endpoint=None, lifecycle_rules=None, location=None, logging=None, logging_isenable=None, owner=None, policy=None, redundancy_type=None, referer_config=None, server_side_encryption_rule=None, storage_class=None, tags=None, versioning=None, website=None):
        """
        Get an existing Bucket resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be "private", "public-read" and "public-read-write". Defaults to "private".
        :param pulumi.Input[list] cors_rules: A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
        :param pulumi.Input[str] creation_date: The creation date of the bucket.
        :param pulumi.Input[str] extranet_endpoint: The extranet access endpoint of the bucket.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to "false".
        :param pulumi.Input[str] intranet_endpoint: The intranet access endpoint of the bucket.
        :param pulumi.Input[list] lifecycle_rules: A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
        :param pulumi.Input[str] location: The location of the bucket.
        :param pulumi.Input[dict] logging: A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
        :param pulumi.Input[bool] logging_isenable: The flag of using logging enable container. Defaults true.
        :param pulumi.Input[str] owner: The bucket owner.
        :param pulumi.Input[str] policy: Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
        :param pulumi.Input[str] redundancy_type: The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be "LRS", and "ZRS". Defaults to "LRS".
        :param pulumi.Input[dict] referer_config: The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
        :param pulumi.Input[dict] server_side_encryption_rule: A configuration of server-side encryption (documented below).
        :param pulumi.Input[str] storage_class: Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
        :param pulumi.Input[dict] versioning: A state of versioning (documented below).
        :param pulumi.Input[dict] website: A website object(documented below).

        The **cors_rules** object supports the following:

          * `allowedHeaders` (`pulumi.Input[list]`) - Specifies which headers are allowed.
          * `allowedMethods` (`pulumi.Input[list]`) - Specifies which methods are allowed. Can be GET, PUT, POST, DELETE or HEAD.
          * `allowedOrigins` (`pulumi.Input[list]`) - Specifies which origins are allowed.
          * `exposeHeaders` (`pulumi.Input[list]`) - Specifies expose header in the response.
          * `maxAgeSeconds` (`pulumi.Input[float]`) - Specifies time in seconds that browser can cache the response for a preflight request.

        The **lifecycle_rules** object supports the following:

          * `enabled` (`pulumi.Input[bool]`) - Specifies lifecycle rule status.
          * `expirations` (`pulumi.Input[list]`) - Specifies a period in the object's expire (documented below).
            * `date` (`pulumi.Input[str]`) - Specifies the date after which you want the corresponding action to take effect. The value obeys ISO8601 format like `2017-03-09`.
            * `days` (`pulumi.Input[float]`) - Specifies the number of days after object creation when the specific rule action takes effect.

          * `id` (`pulumi.Input[str]`) - Unique identifier for the rule. If omitted, OSS bucket will assign a unique name.
          * `prefix` (`pulumi.Input[str]`) - Object key prefix identifying one or more objects to which the rule applies. Default value is null, the rule applies to all objects in a bucket.
          * `transitions` (`pulumi.Input[list]`) - Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. (documented below).
            * `createdBeforeDate` (`pulumi.Input[str]`) - Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that objects updated before 2002-10-11T00:00:00.000Z are deleted or converted to another storage class, and objects updated after this time (including this time) are not deleted or converted.
            * `days` (`pulumi.Input[float]`) - Specifies the number of days after object creation when the specific rule action takes effect.
            * `storage_class` (`pulumi.Input[str]`) - Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`. 

        The **logging** object supports the following:

          * `targetBucket` (`pulumi.Input[str]`) - The name of the bucket that will receive the log objects.
          * `targetPrefix` (`pulumi.Input[str]`) - To specify a key prefix for log objects.

        The **referer_config** object supports the following:

          * `allowEmpty` (`pulumi.Input[bool]`) - Allows referer to be empty. Defaults false.
          * `referers` (`pulumi.Input[list]`) - The list of referer.

        The **server_side_encryption_rule** object supports the following:

          * `kmsMasterKeyId` (`pulumi.Input[str]`) - The alibaba cloud KMS master key ID used for the SSE-KMS encryption. 
          * `sseAlgorithm` (`pulumi.Input[str]`) - The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.

        The **versioning** object supports the following:

          * `status` (`pulumi.Input[str]`) - Specifies the versioning state of a bucket. Valid values: `Enabled` and `Suspended`.

        The **website** object supports the following:

          * `errorDocument` (`pulumi.Input[str]`) - An absolute path to the document to return in case of a 4XX error.
          * `indexDocument` (`pulumi.Input[str]`) - Alicloud OSS returns this index document when requests are made to the root domain or any of the subfolders.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["acl"] = acl
        __props__["bucket"] = bucket
        __props__["cors_rules"] = cors_rules
        __props__["creation_date"] = creation_date
        __props__["extranet_endpoint"] = extranet_endpoint
        __props__["force_destroy"] = force_destroy
        __props__["intranet_endpoint"] = intranet_endpoint
        __props__["lifecycle_rules"] = lifecycle_rules
        __props__["location"] = location
        __props__["logging"] = logging
        __props__["logging_isenable"] = logging_isenable
        __props__["owner"] = owner
        __props__["policy"] = policy
        __props__["redundancy_type"] = redundancy_type
        __props__["referer_config"] = referer_config
        __props__["server_side_encryption_rule"] = server_side_encryption_rule
        __props__["storage_class"] = storage_class
        __props__["tags"] = tags
        __props__["versioning"] = versioning
        __props__["website"] = website
        return Bucket(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

