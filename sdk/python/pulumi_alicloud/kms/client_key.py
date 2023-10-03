# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ClientKeyArgs', 'ClientKey']

@pulumi.input_type
class ClientKeyArgs:
    def __init__(__self__, *,
                 aap_name: pulumi.Input[str],
                 password: pulumi.Input[str],
                 not_after: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 private_key_data_file: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ClientKey resource.
        :param pulumi.Input[str] aap_name: ClientKey's parent Application Access Point name.
        :param pulumi.Input[str] password: To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        :param pulumi.Input[str] not_after: The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        :param pulumi.Input[str] not_before: The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        :param pulumi.Input[str] private_key_data_file: The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        """
        ClientKeyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            aap_name=aap_name,
            password=password,
            not_after=not_after,
            not_before=not_before,
            private_key_data_file=private_key_data_file,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             aap_name: pulumi.Input[str],
             password: pulumi.Input[str],
             not_after: Optional[pulumi.Input[str]] = None,
             not_before: Optional[pulumi.Input[str]] = None,
             private_key_data_file: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("aap_name", aap_name)
        _setter("password", password)
        if not_after is not None:
            _setter("not_after", not_after)
        if not_before is not None:
            _setter("not_before", not_before)
        if private_key_data_file is not None:
            _setter("private_key_data_file", private_key_data_file)

    @property
    @pulumi.getter(name="aapName")
    def aap_name(self) -> pulumi.Input[str]:
        """
        ClientKey's parent Application Access Point name.
        """
        return pulumi.get(self, "aap_name")

    @aap_name.setter
    def aap_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "aap_name", value)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> Optional[pulumi.Input[str]]:
        """
        The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        """
        return pulumi.get(self, "not_after")

    @not_after.setter
    def not_after(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_after", value)

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> Optional[pulumi.Input[str]]:
        """
        The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        """
        return pulumi.get(self, "not_before")

    @not_before.setter
    def not_before(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_before", value)

    @property
    @pulumi.getter(name="privateKeyDataFile")
    def private_key_data_file(self) -> Optional[pulumi.Input[str]]:
        """
        The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        """
        return pulumi.get(self, "private_key_data_file")

    @private_key_data_file.setter
    def private_key_data_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key_data_file", value)


@pulumi.input_type
class _ClientKeyState:
    def __init__(__self__, *,
                 aap_name: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 not_after: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 private_key_data_file: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ClientKey resources.
        :param pulumi.Input[str] aap_name: ClientKey's parent Application Access Point name.
        :param pulumi.Input[str] create_time: Create timestamp, e.g. "2022-08-10T08:03:30Z".
        :param pulumi.Input[str] not_after: The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        :param pulumi.Input[str] not_before: The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        :param pulumi.Input[str] password: To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        :param pulumi.Input[str] private_key_data_file: The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        """
        _ClientKeyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            aap_name=aap_name,
            create_time=create_time,
            not_after=not_after,
            not_before=not_before,
            password=password,
            private_key_data_file=private_key_data_file,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             aap_name: Optional[pulumi.Input[str]] = None,
             create_time: Optional[pulumi.Input[str]] = None,
             not_after: Optional[pulumi.Input[str]] = None,
             not_before: Optional[pulumi.Input[str]] = None,
             password: Optional[pulumi.Input[str]] = None,
             private_key_data_file: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if aap_name is not None:
            _setter("aap_name", aap_name)
        if create_time is not None:
            _setter("create_time", create_time)
        if not_after is not None:
            _setter("not_after", not_after)
        if not_before is not None:
            _setter("not_before", not_before)
        if password is not None:
            _setter("password", password)
        if private_key_data_file is not None:
            _setter("private_key_data_file", private_key_data_file)

    @property
    @pulumi.getter(name="aapName")
    def aap_name(self) -> Optional[pulumi.Input[str]]:
        """
        ClientKey's parent Application Access Point name.
        """
        return pulumi.get(self, "aap_name")

    @aap_name.setter
    def aap_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aap_name", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Create timestamp, e.g. "2022-08-10T08:03:30Z".
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> Optional[pulumi.Input[str]]:
        """
        The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        """
        return pulumi.get(self, "not_after")

    @not_after.setter
    def not_after(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_after", value)

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> Optional[pulumi.Input[str]]:
        """
        The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        """
        return pulumi.get(self, "not_before")

    @not_before.setter
    def not_before(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_before", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="privateKeyDataFile")
    def private_key_data_file(self) -> Optional[pulumi.Input[str]]:
        """
        The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        """
        return pulumi.get(self, "private_key_data_file")

    @private_key_data_file.setter
    def private_key_data_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key_data_file", value)


class ClientKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aap_name: Optional[pulumi.Input[str]] = None,
                 not_after: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 private_key_data_file: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a KMS Client Key resource. Client key (of Application Access Point).

        For information about KMS Client Key and how to use it, see [What is Client Key](https://www.alibabacloud.com/help/zh/key-management-service/latest/api-createclientkey).

        > **NOTE:** Available since v1.210.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        a_ap0 = alicloud.kms.ApplicationAccessPoint("aAP0",
            policies=["aa"],
            description="aa",
            application_access_point_name=name)
        default = alicloud.kms.ClientKey("default",
            aap_name=a_ap0.application_access_point_name,
            password="YouPassword123!",
            not_before="2023-09-01T14:11:22Z",
            not_after="2028-09-01T14:11:22Z",
            private_key_data_file="./private_key_data_file.txt")
        ```

        ## Import

        KMS Client Key can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kms/clientKey:ClientKey example <id>
        ```

         Resource attributes such as `password`, `private_key_data_file` are not available for imported resources as this information cannot be read from the KMS API.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aap_name: ClientKey's parent Application Access Point name.
        :param pulumi.Input[str] not_after: The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        :param pulumi.Input[str] not_before: The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        :param pulumi.Input[str] password: To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        :param pulumi.Input[str] private_key_data_file: The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClientKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a KMS Client Key resource. Client key (of Application Access Point).

        For information about KMS Client Key and how to use it, see [What is Client Key](https://www.alibabacloud.com/help/zh/key-management-service/latest/api-createclientkey).

        > **NOTE:** Available since v1.210.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        a_ap0 = alicloud.kms.ApplicationAccessPoint("aAP0",
            policies=["aa"],
            description="aa",
            application_access_point_name=name)
        default = alicloud.kms.ClientKey("default",
            aap_name=a_ap0.application_access_point_name,
            password="YouPassword123!",
            not_before="2023-09-01T14:11:22Z",
            not_after="2028-09-01T14:11:22Z",
            private_key_data_file="./private_key_data_file.txt")
        ```

        ## Import

        KMS Client Key can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kms/clientKey:ClientKey example <id>
        ```

         Resource attributes such as `password`, `private_key_data_file` are not available for imported resources as this information cannot be read from the KMS API.

        :param str resource_name: The name of the resource.
        :param ClientKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClientKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ClientKeyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aap_name: Optional[pulumi.Input[str]] = None,
                 not_after: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 private_key_data_file: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClientKeyArgs.__new__(ClientKeyArgs)

            if aap_name is None and not opts.urn:
                raise TypeError("Missing required property 'aap_name'")
            __props__.__dict__["aap_name"] = aap_name
            __props__.__dict__["not_after"] = not_after
            __props__.__dict__["not_before"] = not_before
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["private_key_data_file"] = private_key_data_file
            __props__.__dict__["create_time"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ClientKey, __self__).__init__(
            'alicloud:kms/clientKey:ClientKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aap_name: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            not_after: Optional[pulumi.Input[str]] = None,
            not_before: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            private_key_data_file: Optional[pulumi.Input[str]] = None) -> 'ClientKey':
        """
        Get an existing ClientKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aap_name: ClientKey's parent Application Access Point name.
        :param pulumi.Input[str] create_time: Create timestamp, e.g. "2022-08-10T08:03:30Z".
        :param pulumi.Input[str] not_after: The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        :param pulumi.Input[str] not_before: The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        :param pulumi.Input[str] password: To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        :param pulumi.Input[str] private_key_data_file: The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClientKeyState.__new__(_ClientKeyState)

        __props__.__dict__["aap_name"] = aap_name
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["not_after"] = not_after
        __props__.__dict__["not_before"] = not_before
        __props__.__dict__["password"] = password
        __props__.__dict__["private_key_data_file"] = private_key_data_file
        return ClientKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aapName")
    def aap_name(self) -> pulumi.Output[str]:
        """
        ClientKey's parent Application Access Point name.
        """
        return pulumi.get(self, "aap_name")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Create timestamp, e.g. "2022-08-10T08:03:30Z".
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> pulumi.Output[Optional[str]]:
        """
        The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        """
        return pulumi.get(self, "not_after")

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> pulumi.Output[Optional[str]]:
        """
        The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        """
        return pulumi.get(self, "not_before")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="privateKeyDataFile")
    def private_key_data_file(self) -> pulumi.Output[Optional[str]]:
        """
        The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        """
        return pulumi.get(self, "private_key_data_file")

